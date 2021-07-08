 
/*
Código adaptado, com base no livro: 
(Adapted code, based on the book: )
Livro Programação com Kotlin - pag. 18 Capítulo 04
Packt - Novatec - by Stephen Samuel, Stefan Bocutiu 
*/

/*
Substituição da herança pela composição, reduzindo o acoplamento de tipos.
(Replacement of inheritance with composition, reducing type coupling. )
*/

fun main() {
    var panel = Panel(Rectangle(5,50,35,50))
	println("Panel height:"+panel.getHeight())
    println("Panel width:"+panel.getWidth())
    panel.drawRectangle()
}

// Delegação de classe por meio de associação:
// Class delegation through association: 

interface UIElement{
    fun getHeight(): Int
    fun getWidth(): Int
}


class Rectangle(val x1: Int, val x2: Int, val y1: Int, val y2: Int) : UIElement{
    override fun getHeight() = y2 - y1
    override fun getWidth() = x2 - x1
}

class Panel(val rectangle: Rectangle) : UIElement by rectangle{
// by encaminha as chamadas para os métodos espostos pela interface UIElement ao objeto Rectangle subjacente. 
//the term "by" forwards calls to the methods provided by the UIElement interface to the underlying Rectangle object.

    fun drawRectangle(){
        println("")
        var x:Int = 0
        var y:Int = 0
        while( x<getWidth() ){
            print("W")
            x++
        }

        println("")
        while( y<getHeight() ){    
            print("H")
            var z:Int = getWidth()-2
            while( z> 0){
                print(" ")
                z--
            }
            print("H")
            y++
            println("")
        }

        var k:Int = 0
        while( k<getWidth() ){
            print("W")
            k++
        }

    }

}
