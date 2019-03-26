import kotlin.math.absoluteValue

class Knight():AnyPiece {
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

        if (((yNew - yOld).absoluteValue ==2) &&((xNew - xOld).absoluteValue==1))
            return super.move(table, element, loc)
        else if (((yNew - yOld).absoluteValue ==1) &&((xNew - xOld).absoluteValue==2))
            return super.move(table, element, loc)
        return table
    }
}