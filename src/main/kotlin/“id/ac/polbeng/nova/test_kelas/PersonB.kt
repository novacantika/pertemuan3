package `“id`.ac.polbeng.nova.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val Nova = PersonB("Nova", "Cantika Fitri", 20)
    println("Name : ${Nova.firstName} ${Nova.lastName}")
    println("Age : ${Nova.age}")
}