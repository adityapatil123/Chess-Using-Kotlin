import kotlin.math.absoluteValue

class Queen:AnyPiece{
    override fun kill(table:MutableList<MutableList<Element>>,element: Element,loc:Array<Int>):MutableList<MutableList<Element>> {
        return table
    }

    override fun check() {
        println("")
    }

    override fun move(
        table: MutableList<MutableList<Element>>,
        element: Element,
        loc: Array<Int>
    ): MutableList<MutableList<Element>> {
       // return super<Bishop>.move(table, element, loc)

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

        var a=0
        if((yNew!=yOld)&&(xNew==xOld))
        {
            a= yNew-yOld
            if(a > 0) {
                for (i in 1..a - 1) {
                    if (table[yNew - i][xOld] != Element(' ', '-', ' ')) {
                        println("Cant Move when someone is in between")
                        return table
                    }

                }
            }
            else{
                for (i in (-1).downTo(a+1)) {
                    if (table[yNew - i][xOld] != Element(' ', '-', ' ')) {
                        println("Cant Move when someone is in between")
                        return table
                    }

                }
            }
            return super.move(table, element, loc)
        }
        else if((xNew!=xOld)&&(yNew==yOld))
        {
            a= xNew-xOld
            if(a>0) {
                for (i in 0..a - 1) {
                    if (table[yOld][xNew - i] != Element(' ', '-', ' ')) {
                        println("Cant Move when someone is in between")
                        return table
                    }
                }
            }
            else if(a<0){
                for (i in (-1).downTo(a+1)) {
                    if (table[yOld][xNew - i] != Element(' ', '-', ' ')) {
                        println("Cant Move when someone is in between")
                        return table
                    }

                }
            }
            return super.move(table, element, loc)
        }

        if ((yNew - yOld).absoluteValue == (xNew - xOld).absoluteValue) {
            if(yNew-yOld == xOld-xNew)
            {
                var a = yNew-yOld
                if(a > 0) {
                    for (i in 1..a - 1) {
                        if (table[yOld + i][xOld - i] != Element(' ', '-', ' ')) {
                            println("Cant Move when someone is in between")
                            return table
                        }

                    }
                }
                else{
                    for (i in (-1).downTo(a+1)) {
                        if (table[yOld + i][xOld - i] != Element(' ', '-', ' ')) {
                            println("Cant Move when someone is in between")
                            return table
                        }

                    }
                }
            }
            else{
                var a = yNew-yOld
                if(a > 0) {
                    for (i in 1..a - 1) {
                        if (table[yOld + i][xOld + i] != Element(' ', '-', ' ')) {
                            println("Cant Move when someone is in between")
                            return table
                        }

                    }
                }
                else{
                    for (i in (-1).downTo(a+1)) {
                        if (table[yOld + i][xOld + i] != Element(' ', '-', ' ')) {
                            println("Cant Move when someone is in between")
                            return table
                        }

                    }
                }
            }
            return super.move(table, element, loc)
        }
        return table


    }
}