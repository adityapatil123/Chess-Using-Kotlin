open class FactoryPattern {
    fun askedChoice(elementName:Char):AnyPiece
    {

        if(elementName=='P')
            return Pawn()
        else if(elementName=='R')
            return Rook()
        else if(elementName=='B')
            return Bishop()
        else if(elementName=='B')
            return Knight()
        else if(elementName=='Q')
            return Queen()
        else
            return King()


    }
}