class Car private constructor(builder: Car.Builder){
    val engine: String?
    val color: String?
    val transmition: String?

    init{
        this.engine = builder.engine
        this.color = builder.color
        this.transmition = builder.transmition
    }

    class Builder{
        var engine: String = "Petrol"
        private set
        var color: String = "Blue"
        var transmition = "Manual"

        fun engine(engine: String):Builder{
            this.engine = engine
            return this
        }

        fun color(color: String) = apply{this.color = color}
        fun transmition(trainsmition: String) = apply{this.transmition = transmition}

        fun build():Car{
            return Car(this)
        }
    }
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


    val car = Car.Builder().build()

    val carPetrolBuilder = Car.Builder().engine("Petrol")

    val car2: Car = carPetrolBuilder.color("Blue").build()
    val car3: Car = carPetrolBuilder.color("Yellow").build()

    val car1 = Car.Builder().engine("Diesel").color("Green").build()
    Car.Builder().engine = "Diesel"

}

fun add(a: Int = 10, b: Int = 5):Int{
    return a+b
}


