fun Int.toExponential(exp: Int): Int {

    var base = 1L
    var exponecnial = exp

    while (exponecnial != 0) {
        base *= this
        --exponecnial
    }

    return base.toInt()
}

fun Double.toExponential(exp: Int): Double {

    var base = 1L
    var exponecnial = exp

    while (exponecnial != 0) {
        base *= this.toLong()
        --exponecnial
    }

    return base.toDouble()
}

fun Double.formatDecimal(digits: Int = 2): String {

    return String.format("%.${digits}f", this)

}