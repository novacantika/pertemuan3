package `“id`.ac.polbeng.nova.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val Bunga = PersonE("Gina", "Eka")
    Bunga.cetakInfo()
    println()
    val Nova = PersonE("Nova", "Cantika fitri", 20)
    Nova.cetakInfo()
}