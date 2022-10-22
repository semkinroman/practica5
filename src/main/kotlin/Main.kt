import kotlin.math.pow
import kotlin.math.sqrt
enum class Colors{ Red,White,Green,Blue,Black}

open class Point(_x:Double, _y:Double) {
    val point_x:Double
    val point_y:Double
  init{
      point_x=_x
      point_y=_y }
    open fun printInform(){
        println("Points:\n"+"Point(X):$point_x \n"+"Points(Y):$point_y")
    }
}
class ColoredPoint(_color:String,_x:Double,_y:Double):Point(_x,_y){
    val color:String
    init{
        color=_color
    }
    override fun printInform() {
        super.printInform()
        println("Color:$color")
    }
}
open class Line(_p1:Point, _p2:Point) {
    var p1:Point
    var p2:Point
    var lenght:Double
    init{
        p1=_p1
        p2=_p2
        lenght= sqrt((p2.point_x-p1.point_x).pow(2)+(p2.point_y-p1.point_y).pow(2))
    }

    open fun printInform(){

        //длина сегмента=

        println("Points:\n"+"Point(X1): ${p1.point_x} \n"+"Points(Y1): ${p1.point_y}\n"+"Point(X2): ${p2.point_x} \n"+"Points(Y2): ${p2.point_y}\n"+"Length of the segment: $lenght\n") }}

class ColoredLine(_color:String,_p1:Point,_p2:Point):Line(_p1,_p2) {
    var color:String
    init{ color=_color }
    override fun printInform() {
    super.printInform()

    println("Cut color:$color")

    //Цвет огранки: зеленый

    }
}


/*class Polygone(_points:Array<>){
 ///Line(Point(1.0,1.0),Point(5.0,5.0))
 val points:Array<Point>
 init{ points=_points
 } } }*/

fun main() {
       var coloredPoint:ColoredPoint = ColoredPoint("Red",1.0,4.0)
    // var polygones:Polygone=Polygone()

       var line:Line =ColoredLine("Green",Point(0.0,1.4),Point(6.7,2.4))
       line.printInform()
}
