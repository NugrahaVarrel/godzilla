//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val result = calculateRectangleArea(7,8)
    println(result)


    val result2 = checkEvenOdd(25)
    println(result2)

    sayHi()

    val resultSquare = square(5)
    println(resultSquare)

    val resultSumList = sumList(listOf(1,2,3,4,5))
    println(resultSumList)

}
fun calculateRectangleArea(length: Int, width:Int): Int{
    return length * width
}
fun checkEvenOdd(number: Int): String{
    if (number % 2 == 0){
        return "Genap"
    }else{
        return "Ganjil"
    }
}
fun sayHi(name: String = "Guest"){
    println("Hi, $name")
}
fun square(n: Int) = n * n

fun sumList(numbers: List<Int>): Int{
    var result =0
    for (num in numbers){
        result+=num
    }
    return result
}
