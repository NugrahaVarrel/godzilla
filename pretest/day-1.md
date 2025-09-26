### **Instructions:**

- For **optional questions**, select the correct answer.
- For **short answer questions**, provide a concise response.
- For **yes/no questions**, simply answer “yes” or “no.”
- For **correct-the-code questions**, review the provided code snippet, identify the mistake, and write the corrected version.

---

### **Pretest + Posttest Questions**

#### **Optional (Choose the correct answer):**

1. Which of the following is the correct way to declare a variable in Kotlin?

   **- a) `var x = 10`**
   - b) `let x = 10`
   - c) `dim x as 10`
   - d) `declare x = 10`

2. What keyword is used to declare a constant in Kotlin?

   - a) `let`
   **- b) `const`**
   - c) `final`
   - d) `val`

3. How do you define a function in Kotlin?

   - a) `function myFunction() {}`
   - b) `def myFunction() {}`
   **- c) `fun myFunction() {}`**
   - d) `lambda myFunction() {}`

4. What is the result of `5 % 2` in Kotlin?

   - a) `2.5`
   **- b) `1`**
   - c) `0`
   - d) `5`

5. Which data type in Kotlin represents a true or false value?
   - a) `Int`
   - b) `String`
   **- c) `Boolean`**
   - d) `Float`

---

#### **Short Answer:**

6. What is the difference between `var` and `val` in Kotlin?
    var itu mendeklarasikan variable yang bisa diganti, sedangkan val
    mendeklarasikan variabel yang tidak bisa diganti

7. How do you create a list in Kotlin?
    val immutableList : List <String> = listOf ("Red", "Green", "Blue")

8. Write a simple `if-else` statement in Kotlin.
    ```kotlin
    val angka = 10
    if (angka > 0){
        println("Angka Positif")
    } else{
        println("Angka Negatif atau nol")
    }

9. How do you handle nullability in Kotlin?
    ```kotlin
    var nama : String? = "Varrel"

10. What is a lambda function in Kotlin?
    ```kotlin
    val namalambda: (Int, Int) = {a, b -> a + b}
    println(namaLambda(5,3)) //8
    
    Penjelasan: (Int, Int) -> Int → tipe fungsi (parameter Int, Int, return Int).
    { a, b -> a + b } → lambda function.
    

11. How do you define a class in Kotlin?
    ```kotlin
    class mobil {
        var merk: String = "Toyota"
        var tahun: Int = 2020
    
        fun info(){
            println("Mobil $merk tahun $tahun")
        }
    }

12. How do you use a `for` loop to iterate through a list in Kotlin?
    ```kotlin
    for(i in 1<= .. <=5){
        println("i = $i)
    }

13. What does the `when` statement do in Kotlin?
    Hampir sama seperti Switch tapi jauh lebih fleksibel.
    ```kotling
    fun main() {
    val userRole = "Editor"

    when (userRole) {
        "Viewer" -> println("User has read-only access")
        "Editor" -> println("User can edit content")
        "Admin" -> println("User has administrative privileges")
        else -> println("User role is not recognized")
    }

14. How do you check if a number is even in Kotlin?
    % MODULUS

15. How do you declare an array in Kotlin?
    ```kotlin
    var number : Array<int> = listOf(1,2,3,4,5)

---

#### **Yes/No Questions:**

16. Can `val` be reassigned to a new value after its initial assignment?
    No

17. Does Kotlin support operator overloading?
    Yes

18. Is Kotlin fully interoperable with Java?
    Yes

19. Can a function in Kotlin return a value using `return` keyword?
    Yes

20. Can Kotlin's `when` statement be used as an expression to return values?
    Yes
---

#### **Correct the Code (with Answers):**

21. **Incorrect code:**

    ```kotlin
    val x = "Hello"
    x = "World"
    ```
    **Correct Code:**

    ```kotlin
    var x = "Hello"
    x = "World"
    ```
    
22. **Incorrect code:**

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    sum(5, 10)
    ```
    **Correction Code:**:

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    sum(5, 10)
    ```

23. **Incorrect code:**

    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```
    
    **Correct Code:**

    ```kotlin
    val myList = mutableof(1,2,3)
    myList.add(4)
    ```

24. **Incorrect code:**

    ```kotlin
    val name: String = null
    ```

    **Correct Code:**

    ```kotlin
    val name: String?
    ```


25. **Incorrect code:**

    ```kotlin
    if x > 5 {
        println("x is greater than 5")
    }
    ```

    **Correct Code:**

    ```kotlin
    if(x > 5){
        println("x is greather than 5")
    }
    ```

26. **Incorrect code:**

    ```kotlin
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else println("Other")
    }
    ```
    
    **Correct Code**
    ```kotlin
        when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    }
    ```

27. **Incorrect code:**

    ```kotlin
    fun greet() {
        println("Hello, $name)
    }
    ```
    
    **Correct Code**
    ```kotlin
    fun greet() {
    println("Hello, $name")
    }
    ```

28. **Incorrect code:**

    ```kotlin
    val myVar = "10"
    val result = myVar + 5
    ```
    **Correct Code:**

    ```kotlin
    val myVar = 10
    val result = myVar + 5
    ```

29. **Incorrect code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[3])
    ```
    **Correct Code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[2])
    ```

30. **Incorrect code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is " + name + " and I'm " + age)
        }
    }
    ```
    **Correcct code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is $name and I'm $age")
        }
    }
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

Imagine you are building a ticket booking system for a movie theater. Each customer can reserve a seat by providing their name and the seat number. The seat numbers are stored in an array, and the program should check if the seat is available. If available, the seat will be reserved, and if not, a message will be displayed to the user that the seat is taken.

Here’s the failed code:

```kotlin
fun reserveSeat(name: String, seatNumber: Int) {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```

**Correct Code:**
```kotlin
fun reserveSeat(name: String, seatNumber: Int) {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber-1] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```

