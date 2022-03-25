package `“id`.ac.polbeng.nova.test_kelas

// Parent Class
open class Computer(val name: String,
                    val brand: String) {
}
// child class (initializes the parent class)
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("AsusVivoBook 14 K413 ", "ASUSVivoBooK", 2.5)
    println(myLaptop.info())
}