package `“id`.ac.polbeng.nova.test_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val Nova = PersonD("Nova", "Cantika Fitri", 20)
    println("Name : ${Nova.firstName} ${Nova.lastName}")
    println("Age : ${Nova.age}")
}