//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Soal 1
    val scores = arrayOf(70, 85, 90, 60, 75)
    var total = 0
    for (score in scores){
        total += score
    }
    println("Total Akhir : $total")
    println()

    // Soal 2
    val angka = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in angka){
        if (i % 2 == 0){
            println("$i ini genap")
        }
    }
    println()

    // Soal 3
    val fruits =listOf<String>("Apple", "Banana", "Mango", "Orange", "Grapes")
    for (fruis in fruits){
        if (fruis == "Mango"){
            println("Mango ditemukan")
            break
        }
    }
    println()

    // Soal 4
    var count = 10
    while (count >=1){
        println(count)
        count--
    }
    println("Selesai!")

    // Soal 5
    var nameStudents = listOf<String>("Andi", "Budi", "Cici", "Dedi")
    for ((index, name) in nameStudents.withIndex()){
        println("Index ke : ${index+1} adalah $name")
    }
}