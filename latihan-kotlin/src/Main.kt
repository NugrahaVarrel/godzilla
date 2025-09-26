//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // BAGIAN 1
    // no 1
    val studentName : String = "Nugraha Varrel Kusuma"
    println("Nama Lengkap Saya: $studentName")

    //no 2
    val umur : Int = 22
    print("Umur saya: $umur")

    //no 3
    val temperature : Float = 36.7f
    print("Temperatur saya adalah $temperature")

    //no 4
    val isGraduated : Boolean = false
    println("Apakah saya sudah menikah: $isGraduated")

    //no 5
    val grade : Char = 'A'
    println("grade saya adalah: $grade")

    // BAGIAN 2
    //no 1
    val population : Long = 273_000_000
    println("population : $population")

    //no 2
    val smallNumber: Short = 32000
    println("angka kecil $smallNumber")

    //no 3
    val tinyvalue: Byte = 127
    println("angka sangat kecil $tinyvalue")

    //no 4
    println("ini adalah population $population, ini adalah angka kecil $smallNumber, ini adalah angka sangat kecil $tinyvalue")


    // BAGIAN 3
    //no 1
    val nickname : String?

    //no 2
    nickname = "varrel"

    //no 3
    println(nickname)


    // BAGIAN 4
    // No 1
    val numbers : Array<Int> = arrayOf(1,2,3,4,5)
    println("Semua Elemen Numbers : ${numbers.toList()}")

    //No 2
    val fruits : List<String> = listOf("Apple", "Banana", "Mango")
    println("List Buah : $fruits")

    //No 3
    val mutableListOfScores : MutableList<Int> = mutableListOf(80,85,90)
    mutableListOfScores.add(95)
    println(mutableListOfScores)


    //No 4
    val setOfNumbers = setOf<Int>(1,2,2,3,3,4)
    println(setOfNumbers)

    //No 5
    val mapOfStudent : Map<String, Int> = mapOf("Math" to 90, "Science" to 85)
    println(mapOfStudent)


    // BAGIAN 5
    // No 1
    val city : String = "Jakarta"
    val year : Int = 2025
    val pi : Float = 3.14159f
    println("city: $city, year: $year, pi: $pi")

    // No 2
    var isLoggedIn : Boolean = false
    println(isLoggedIn)
    isLoggedIn = true
    println(isLoggedIn)

    // No 3
    var charList : Array<Char> = arrayOf('K', 'H', 'A', 'L', 'I', 'D')
    println(charList.toList())

    // Bagian 6
    // No 1
    var studentInfo : MutableMap<String, Any> = mutableMapOf("nama" to "Varrel", "age" to 22, "score" to 66.6, "isGraduated" to false)
    println(studentInfo)

    // No 2
    var grades : Array<Char> = arrayOf('A', 'B', 'C', 'D', 'E')
    println("nilai pertama ${grades.first()}")
    println("nilai terakhir ${grades.last()}")

    // No 3
    var hobbies : MutableList<String> = mutableListOf("Tidur", "Ngopi", "Belajar")
    hobbies.remove("Ngopi")
    println(hobbies)
}