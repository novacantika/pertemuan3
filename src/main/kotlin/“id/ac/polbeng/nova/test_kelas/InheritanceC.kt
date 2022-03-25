package `“id`.ac.polbeng.nova.test_kelas

open class Teacher {
    // Must use "open" modifier to allow chilld classes to override it
    open fun teach(){
        println("Teaching...")
    }
    fun info(){
        println("I'am a  Teacher.")
    }
}
class MathsTeacher : Teacher(){
    //Must use "override" modifier to ovveride a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}