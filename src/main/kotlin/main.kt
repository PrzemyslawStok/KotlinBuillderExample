class Car{

}

class Student(var name: String, var surname: String, var university: String = "WSIZ BB"){
    override fun toString(): String {
        return "Student(name='$name', surname='$surname', university='$university')"
    }
}

fun main() {
    println(Student("Przemysław","Stokłosa"))

    add(5,10)
    add(5)
    add()
}

fun add(a: Int = 10, b: Int = 5):Int{
    return a+b
}


