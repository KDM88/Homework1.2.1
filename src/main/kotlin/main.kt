fun main() {
    val amount = 5_000_000
    val commission = 0.0075
    val minCommission = 3500

    val totalCommission = amount * commission
    val result = if (totalCommission < minCommission)  minCommission else totalCommission
    val intResult = result.toInt()
    println("Комиссия за перевод составит: $intResult копеек")

}