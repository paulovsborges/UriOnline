fun main() {

    val initial = Initial()

    initial.ex1012()

}

class Initial {

    fun ex1001() {

        val a = readLine()
        val b = readLine()

        val x = a!!.toInt() + b!!.toInt()

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

        val test: Triple<String, Int, Double> = Triple(employeeNumber!!, workedHours!!, receivedPerHour!!)

        val sum = test.third * test.second
        println("number  = ${test.first}")
        println("salary  = U$ $sum")

    }

    fun ex1009() {

        println("enter your name:")
        val name = readLine()
        println("how much do you receive per month?")
        val salary = readLine()?.toDouble()
        println("how much did you sell this month?")
        val totalSold = readLine()?.toDouble()

        if (salary != null && totalSold != null) {

            val share = salary + totalSold * 0.15
            println(share)

        }
    }

    fun ex1010() {

        var repeat = true

        var list : Triple<Int, Int, Double>

        var total = 0.0

        val list2 = mutableListOf<Triple<Int, Int, Double>>()

        while (repeat) {

            println("product code:")
            val productCode = readLine()?.toInt()!!

            println("product amount:")
            val productAmount = readLine()?.toInt()!!

            println("unit price:")
            val productPrice = readLine()?.toDouble()!!

            list = Triple(productCode, productAmount, productPrice)
            list2.add(list)

            total += productPrice * productAmount

            val newChoice = readLine()?.toBoolean() ?: false

            repeat = newChoice

            if(repeat){
                continue
            }else{

                val formattedValue = String.format("%.2f", total)

                list2.forEach(::println)
                println(formattedValue)
                break
            }
        }
    }

    fun ex1011 (){

        println("insert the radius")
        val radius = readLine()?.toInt()!!.toExponential(3)

        val pi = 3.14159
        val n1 = 4 / 3.0

        val volume = n1 * pi * radius

        String.format("%.3f", volume).let(::println)

    }

    fun ex1012(){

        val a = readLine()?.toDouble()!!
        val b =readLine()?.toDouble()!!
        val c =readLine()?.toDouble()!!
        val pi = 3.14159

        println("Question A:")
        println("Area of the triangle rectangle is ${((a * c) / 2).formatDecimal(3)}")

        println("Question B")

        val radius = c.toInt().toExponential(2).toDouble()
        val area = pi * radius

        println("the radius circle area is ${area.formatDecimal(3)}")

        println("Question C")

        val trapeziumArea = ((a + b) * c) / 2
        println("The trapezium area is ${trapeziumArea.formatDecimal(3)}")

        println("Question D")

        val square = b.toInt().toExponential(2)
        println("the area  of the square is ${square.toDouble().formatDecimal(3)}")

        println("Question C")

        val rectangle = a * b

        println("the area of the rectangle  is ${rectangle.formatDecimal(3)}")
    }
}