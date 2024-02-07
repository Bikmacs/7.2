import java.lang.Exception
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    try {
        println("ведите Х")
        var x = readLine()!!.toDouble()
        println("ведите Y")
        var y = readLine()!!.toDouble()

        var r = sqrt(x.pow(2) + y.pow(2))
        var R = sqrt(x.pow(2) + y.pow(3))

        when{
            (r < R)-> println("точка попадает в оКРужность с координатами $r  $R")
            (r > R)-> println("точка попадает в оКРужность с координатами $r  $R")
        }
    }catch (e:Exception){
        println("не верю")
    }
}