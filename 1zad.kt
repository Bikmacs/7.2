fun main() {
    try {

        println("Введите значени  x y z")
        var x = readLine()!!.toInt()
        var y = readLine()!!.toInt()
        var z = readLine()!!.toInt()

        var l = 2 * maxOf(x, z) - 3 * minOf(x, y, z)
        println(l)


    } catch (e: Exception) {
        println("не верно")
    }
}