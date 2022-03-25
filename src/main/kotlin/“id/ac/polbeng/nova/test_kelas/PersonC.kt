package `“id`.ac.polbeng.nova.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val Nova = PersonC("Nova", "Cantika Fitri", 20)
    println("Name : ${Nova.firstName} ${Nova.lastName}")
    println("Age : ${Nova.age}")
}