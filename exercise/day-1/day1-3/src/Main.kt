//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // No 2
    val nilai = 90
    if (nilai >= 90){
        println("Nilai A")
    }else if (nilai >= 75){
        println("Nilai B")
    }else if (nilai >= 60){
        println("Nilai C")
    }else{
        println("Tidak Lulus")
    }
    println()

    // No 2
    val number = 10
    val result = if (number % 2 == 0) "Genap" else "Ganjil"
    println(result)

    // No 3
    val day = 6
    when(day){
        1 ->println("Senin")
        2 ->println("Selasa")
        3 ->println("Rabu")
        4 ->println("Kamis")
        5 ->println("Jumaat")
        6 ->println("Sabtu")
        7 ->println("Minggu")
    }

    // No 4
    val grade = 'B'
    when (grade){
        'A', 'B' -> println("Lulus dengan baik")
        'C' -> println("lulus pas pasan")
        'D', 'E' -> println("tidak lulus")
        else -> println("Nilai tidak valid")
    }

    // No 5
    val bulan = 12
    val season = when (bulan){
        12, 1, 6 -> "musim hujan"
        3, 4, 5 -> "musim semi"
        9, 10, 11 -> "musim panas"
        else -> "Nilai tidak valid"
    }
    println("Bulan $bulan adalah $season")
}