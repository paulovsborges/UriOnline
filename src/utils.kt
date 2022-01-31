fun Int.toExponential(exp: Int): Int {

    var base = 1L
    var exponecnial = exp

    while (exponecnial != 0) {
        base *= this
        --exponecnial
    }

    return base.toInt()
}

fun Double.formatDecimal(digits: Int = 2): String {

    return String.format("%.${digits}f", this)

}