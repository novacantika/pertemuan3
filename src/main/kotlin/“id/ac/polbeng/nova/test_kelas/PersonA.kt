package `“id`.ac.polbeng.nova.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val nova = PersonA("Nova", "Cantika fitri", 21)
    println("Name : ${nova.firstName} ${nova.lastName}")
    println("Age : ${nova.age}")
}