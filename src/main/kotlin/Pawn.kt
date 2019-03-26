import kotlin.math.absoluteValue

class Pawn():AnyPiece {
     override fun check()
     {
        println("")
     }
    override fun move(table: MutableList<MutableList<Element>>, element: Element, loc: Array<Int>): MutableList<MutableList<Element>>
    {
        var xNew = loc[0] - 1
        var yNew = 8 - loc[1]
        var xOld = 0
        var yOld = 0

        table.forEachIndexed { index, list ->
            if (list.contains(element)) {
                yOld = index
                xOld = list.indexOf(element)
            }
        }

        if(element.color=='W') {
            if ((yNew < yOld) && (xNew == xOld)) {
                if(yNew==yOld-1)    //||((yNew==yOld-2)&&(yOld==6)))
                {
                    println("No problem in moving")
                    return super.move(table, element, loc)
                }
                else if((yNew==yOld-2)&&(yOld==6))
                {
                    if((table[yOld-1][xOld]==Element(' ','-',' '))){
                        println("No problem in moving")
                        return super.move(table, element, loc)
                    }
                }
                println("Cant move when someone is in between")
                return table

            }
        }
        else if(element.color=='B') {
            if ((yNew > yOld) && (xNew == xOld)) {
                if(yNew==yOld+1)
                {
                    println("No problem in moving")
                    return super.move(table, element, loc)
                }
                else if((yNew==yOld+2)&&(yOld==1))
                {
                    if((table[yOld+1][xOld]==Element(' ','-',' '))){
                        println("No problem in moving")
                        return super.move(table, element, loc)
                    }
                }
                return table

            }
        }

        return table
    }

    override fun kill(table: MutableList<MutableList<Element>>, element: Element, loc: Array<Int>): MutableList<MutableList<Element>>
    {
        var xNew = loc[0] - 1
        var yNew = 8 - loc[1]
        var xOld = 0
        var yOld = 0

        table.forEachIndexed { index, list ->
            if (list.contains(element)) {
                yOld = index
                xOld = list.indexOf(element)
            }
        }

        if(element.color=='W') {
            if ((yNew == yOld - 1) && (xNew - xOld).absoluteValue == 1) {

                println("No problem in moving")
                return super.kill(table, element, loc)
            }
        }
        else if(element.color=='B') {
                if ((yNew == yOld + 1) && (xNew - xOld).absoluteValue == 1) {

                    println("No problem in moving")
                    return super.kill(table, element, loc)
                }
            }
        println("Cant Kill")
        return table
    }

   /* override fun movePawn(xNew:Int,yNew:Int,xOld:Int,yOld:Int,color:Char):Boolean
    {
        if(color=='W') {
            if ((yNew < yOld) && (xNew == xOld)) {
                if((yNew==yOld-1)||((yNew==yOld-2)&&(yOld==6))){
                    println("No problem in moving")
                    return true
                }
            }
            else {
                println("Cant Move!!")
                return false
            }
        }
        else if(color=='B'){
            if ((yNew > yOld) && (xNew == xOld)) {
                if((yNew==yOld+1)||((yNew==yOld+2)&&(yOld==1))){
                    println("No problem in moving")
                    return true
                }
            }
            else {
                println("Cant Move!!")
                return false
            }
        }
         return false

    } */
}