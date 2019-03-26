fun main(args:Array<String>)
{
    val chess1 = Chess()
    var table=chess1.startChess()
    chess1.printArrangent(table)

    var fp = FactoryPattern()
    val p1=fp.askedChoice('P')

    chess1.printArrangent(p1.move(table,Element('B','P','8'), arrayOf(8,5)))
    chess1.printArrangent(p1.move(table,Element('B','P','8'), arrayOf(8,4)))
    chess1.printArrangent(p1.move(table,Element('B','P','5'), arrayOf(5,5)))

    val p2=fp.askedChoice('*')
    chess1.printArrangent(p2.move(table,Element('B','K','0'), arrayOf(5,7)))
    chess1.printArrangent(p2.move(table,Element('B','K','0'), arrayOf(6,6)))

    chess1.printArrangent(p1.move(table,Element('W','P','7'), arrayOf(7,3)))
    chess1.printArrangent(p1.kill(table,Element('W','P','7'), arrayOf(8,4)))
    //chess1.printArrangent(p2.move(table,Element('B','K','2'), arrayOf(5,3)))
    //chess1.printArrangent(p2.move(table,Element('B','R','2'), arrayOf(2,5)))


    //chess1.printArrangent(p1.move(table,Element('B','P','6'), arrayOf(6,3)))
    //chess1.printArrangent(p1.move(table,Element('W','P','6'), arrayOf(6,4)))
}
