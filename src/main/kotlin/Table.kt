open class Chess() {

    fun startChess():MutableList<MutableList<Element>>{
        val table = mutableListOf<MutableList<Element>>()
        table.add(makeRow1())
        table.add(makeRow2())
        for (i in 1..4)
            table.add(makeRow3to6())
        table.add(makeRow7())
        table.add(makeRow8())

        return table
    }

    fun printArrangent(table: MutableList<MutableList<Element>>)
    {
        table.forEach()
        {
            it.forEach {
                it.getElement()
            }
            println("")
        }
    }
    fun makeRow2(): MutableList<Element> {
        val row = mutableListOf<Element>()
        row.add(makeElement('B', 'P', '1'))
        row.add(makeElement('B', 'P', '2'))
        row.add(makeElement('B', 'P', '3'))
        row.add(makeElement('B', 'P', '4'))
        row.add(makeElement('B', 'P', '5'))
        row.add(makeElement('B', 'P', '6'))
        row.add(makeElement('B', 'P', '7'))
        row.add(makeElement('B', 'P', '8'))

        return row
    }

    fun makeRow1(): MutableList<Element> {
        val row = mutableListOf<Element>()
        row.add(makeElement('B', 'R', '1'))
        row.add(makeElement('B', 'K', '1'))
        row.add(makeElement('B', 'B', '1'))
        row.add(makeElement('B', 'Q', '0'))
        row.add(makeElement('B', 'K', '0'))
        row.add(makeElement('B', 'B', '2'))
        row.add(makeElement('B', 'K', '2'))
        row.add(makeElement('B', 'R', '2'))

        return row
    }

    fun makeRow3to6(): MutableList<Element> {
        val row = mutableListOf<Element>()
        for (i in 1..8)
            row.add(makeElement(' ', '-', ' '))

        return row
    }

    fun makeRow7(): MutableList<Element> {
        val row = mutableListOf<Element>()
        row.add(makeElement('W', 'P', '1'))
        row.add(makeElement('W', 'P', '2'))
        row.add(makeElement('W', 'P', '3'))
        row.add(makeElement('W', 'P', '4'))
        row.add(makeElement('W', 'P', '5'))
        row.add(makeElement('W', 'P', '6'))
        row.add(makeElement('W', 'P', '7'))
        row.add(makeElement('W', 'P', '8'))

        return row
    }

    fun makeRow8(): MutableList<Element> {
        val row = mutableListOf<Element>()
        row.add(makeElement('W', 'R', '1'))
        row.add(makeElement('W', 'K', '1'))
        row.add(makeElement('W', 'B', '1'))
        row.add(makeElement('W', 'Q', '0'))
        row.add(makeElement('W', 'K', '0'))
        row.add(makeElement('W', 'B', '2'))
        row.add(makeElement('W', 'K', '2'))
        row.add(makeElement('W', 'R', '2'))

        return row
    }


    fun makeElement(color: Char, elementName: Char, num: Char): Element {
        return Element(color, elementName, num)

    }
}