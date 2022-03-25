package `“id`.ac.polbeng.nova.test_kelas

data class Student(val name: String, val age: Int)
fun main() {
    val Nova = Student("Nova", 20)
    val Gina = Student("Gina", 20)
    println("Student Name is: ${Nova.name}")
    println("Student Age is: ${Nova.age}")
    println("Student Name is: ${Gina.name}")
    println("Student Age is: ${Gina.age}")
}
