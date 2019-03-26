interface AnyPiece {
    fun move(table:MutableList<MutableList<Element>>,element: Element,loc:Array<Int>):MutableList<MutableList<Element>>
        {
            if(AreConditionsFullfilling(table,element,loc)==true) {

                println("Move has been made")
                var x = loc[0]
                var y = loc[1]
                var ix = 0
                var iy = 0

                table.forEachIndexed { index, list ->
                    if (list.contains(element)) {
                        iy = index
                        ix = list.indexOf(element)
                    }
                }

                //if(movePawn(x-1,8-y,ix,iy,element.color)==true) {
                    val ele: Element = table[8 - y][x - 1]
                    table[8 - y][x - 1] = table[iy][ix]
                    table[iy][ix] = ele
                    return table
               // }
            }
            return table

        }
    fun kill(table:MutableList<MutableList<Element>>,element: Element,loc:Array<Int>):MutableList<MutableList<Element>>
    {
        if(AreConditionsFullfilling(table,element,loc)==true) {

            println("Move has been made")
            var x = loc[0]-1
            var y = 8-loc[1]

            if(table[y][x]!=Element(' ','-',' ')){
                var ix = 0
                var iy = 0

                table.forEachIndexed { index, list ->
                    if (list.contains(element)) {
                    iy = index
                    ix = list.indexOf(element)
                    }
                }

                table[y][x] = table[iy][ix]
                table[iy][ix] = Element(' ','-',' ')
                return table
             }
        }
        return table
    }
    fun check()
   // fun movePawn(x:Int,y:Int,ix:Int,iy:Int,color:Char):Boolean

    fun AreConditionsFullfilling(table:MutableList<MutableList<Element>>,element: Element,loc:Array<Int>):Boolean
    {
        var x= loc[0]
        var y=loc[1]
        if(table[8-y][x-1].color!=element.color)
        {
            println("No problem of same color")
            return true
        }
        else
        {
            println("Its your player only!!")
            return false
        }
    }

}