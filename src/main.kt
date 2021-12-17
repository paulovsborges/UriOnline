fun main() {

    val initial = Initial()

}

class Initial {

    fun ex1001() {

        val a = readLine()
        val b = readLine()

        var x = a!!.toInt() + b!!.toInt()

        println(x)

    }

    fun ex1002() {

        val n = 3.14159

        val radius = readLine()

        val area = n * (radius!!.toDouble() * radius.toDouble())

        println(area)

    }

    fun ex1003() {

        val a = readLine()
        val b = readLine()

        val sum = a!!.toInt() + b!!.toInt()

        println("Sum = $sum")
    }

    fun ex1004() {

        val a = readLine()
        val b = readLine()

        val x = a!!.toInt() * b!!.toInt()

        println("product = $x")
    }

    fun ex1005() {

        val a = readLine()
        val b = readLine()

        val list = mutableListOf<Double>()

        list.add(a!!.toDouble())
        list.add(b!!.toDouble())

        val average = (list[0] + list[1]) / list.size

        println("average = $average")

    }
}