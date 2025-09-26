//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Bagian 1 - Aritmatika

    // No 1
    var length = 7
    var width = 4
    var luasPersegiPanjang = length * width

    println("Length: $length, Width: $width, Luas Persegi Panjang: $luasPersegiPanjang")
    println()

    // No2
    var radius =10
    var pi = 3.14
    var kelilingLingkaran = 2 * pi * radius
    println("keliling lingkaran $kelilingLingkaran")

    // No 3
    var a = 200
    var b = 7
    println("a % b = ${a%b}")
    println()

    // Bagian 2 - Perbandingan

    // No 1
    var x = 100
    var y = 200
    println("x < y = ${x < y}")
    println()

    // No 2
    var temp = 36.5
    println("${temp == 37.0}")
    println()

    // No 3
    var m = 50
    var n = 50
    println("${a == b}")
    println()

    // Bagian 3 - Logika

    // No 1
    var isSunny = true
    var isRaining = false
    println("apakah hari ini cerah : ${isSunny && !isRaining}")

    // No 2
    var hasMoney = true
    var isStoreOpen = false
    println("apakah bisa belanja : ${hasMoney || isStoreOpen}")

    // No 3
    var isWeekend = true
    var isHoliday = false
    println("apakah hari ini libur ${isWeekend || isHoliday}")

    // Bagian 4 - Assignment
    // No 1
    var num = 8
    num += 5
    num *= 2
    num -=3
    num /= 5
    println(num)

    // No 2
    var price = 1000
    price -= price * 20 / 100
    println(price)

    // Bagian 5 - Increment / Decrement

    // No 1
    var counter = 10
    counter++
    counter++
    counter--
    counter--
    counter--
    println(counter)

    // No 2
    var points = 0
    points++
    points++
    points++
    points++
    points++
    points--
    println(points)
}