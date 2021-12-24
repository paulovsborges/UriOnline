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

    fun ex1006() {

        val grades = mutableListOf<Double>()

        val a = readLine()?.toDouble()
        val b = readLine()?.toDouble()
        val c = readLine()?.toDouble()

        if (a != null && b != null && c != null) {
            grades.add(a)
            grades.add(b)
            grades.add(c)

            val sum = (a + b + c) / grades.size
            println(sum)

        } else {
            println("invalid values")
        }
    }

    fun ex1007() {

        val a = readLine()?.toInt()!!
        val b = readLine()?.toInt()!!
        val c = readLine()?.toInt()!!
        val d = readLine()?.toInt()!!

        val diff = ((a * b) - (c * d))
        println("difference = $diff")
    }

    fun ex1008() {

        val employeeNumber = readLine()
        val workedHours = readLine()?.toInt()
        val receivedPerHour = readLine()?.toDouble()

        var test: Triple<String, Int, Double> = Triple(employeeNumber!!, workedHours!!, receivedPerHour!!)

        val sum  = test.third * test.second
        println("number  = ${test.first}")
        println("salary  = U$ $sum")

    }
}