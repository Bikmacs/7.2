import java.lang.Exception
import kotlin.math.sqrt

fun main() {

    try {


        val k = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val a = readLine()!!.toDouble()

        val disq = b * b - 4 * a * k * k

        if (disq >= 0) {
            val x1 = (-b + sqrt(disq)) / (2 * a * k)
            val x2 = (-b - sqrt(disq)) / (2 * a * k)

            val y1 = k * x1 + b
            val y2 = k * x2 + b

            val dlin = 1.0
            val poldln = dlin / 2

            if (x1 >= -poldln && x1 <= poldln && y1 >= -poldln && y1 <= poldln &&
                x2 >= -poldln && x2 <= poldln && y2 >= -poldln && y2 <= poldln
            ) {
                println("Обе точки пересечения находятся внутри квадрата")
                println("Точка 1: ($x1, $y1)")
                println("Точка 2: ($x2, $y2)")
            } else {
                println("Хотя бы одна точка пересечения находится вне квадрата")
            }
        } else {
            println("Нет точек пересечения.")
        }
    }catch (e:Exception){
        println("не верно")
    }
}