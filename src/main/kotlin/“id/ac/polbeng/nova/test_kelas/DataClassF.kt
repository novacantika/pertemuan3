package `“id`.ac.polbeng.nova.test_kelas

fun main() {
    val Nova = Student("Nova", 20)
    // Destructuring Declaration with componentN() method
    val name = Nova.component1()
    val age = Nova.component2()
    println("Name = $name")
    println("Age = $age")
}