data class Element (
    val color:Char,
    var elementName:Char,
    var num:Char
    )
{
    fun getElement()
    {
        print(" ")
        print(charArrayOf(color,elementName,num))
    }
}