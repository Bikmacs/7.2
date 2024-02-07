import java.lang.Exception
import kotlin.math.sqrt

fun main(){
    try {

        println("Введите радиус окружности R=")
        val R = readLine()!!.toDouble()

        println("Введите коэффициенты уравнения прямой k, b:")
        val (k, b) = readLine()!!.split(" ").map { it.toDouble() }

        val a = k * k + 1
        val b1 = 2 * k * b
        val c = b * b - R * R
        val d = b1 * b1 - 4 * a * c

        if (d < 0) {
            println("Точек пересечения нет.")
        } else if (d == 0.0) {
            val x1 = -b1 / (2 * a)
            val y1 = k * x1 + b
            println("Прямая касается окружности в точке x=$x1, y=$y1")
        } else if (d > 0) {
            val x1 = (-b1 + sqrt(d)) / (2 * a)
            val y1 = k * x1 + b
            val x2 = (-b1 - sqrt(d)) / (2 * a)
            val y2 = k * x2 + b
            println("Прямая пересекает окружность в двух точках:")
            println("x1=$x1, y1=$y1, x2=$x2, y2=$y2")

            if (x1 > 0 && y1 > 0) {
                println("Точка x1 в первой четверти")
            } else if (x1 < 0 && y1 > 0) {
                println("Точка x1 во второй четверти")
            } else if (x1 < 0 && y1 < 0) {
                println("Точка x1 в третьей четверти")
            } else if (x1 > 0 && y1 < 0) {
                println("Точка x1 в четвертой четверти")
            }

            if (x2 > 0 && y2 > 0) {
                println("Точка x2 в первой четверти")
            } else if (x2 < 0 && y2 > 0) {
                println("Точка x2 во второй четверти")
            } else if (x2 < 0 && y2 < 0) {
                println("Точка x2 в третьей четверти")
            } else if (x2 > 0 && y2 < 0) {
                println("Точка x2 в четвертой четверти")
            }
        }


    }catch (e:Exception){
        println("Не верно")
    }
}