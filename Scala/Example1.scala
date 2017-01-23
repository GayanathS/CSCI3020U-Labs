class Animal(val color: String) {
    override def toString(): String = {
        val c = if(color == "")
                    "transparent"
                else
                    this.color
        s"a ${c} animal"
    }
}

class Cat(val strip:Boolean, c:String) extends Animal(c) {
    override def toString(): String = {
        if(strip) {
            s"a striped ${this.color} cat"
        } else {
            s"a solid ${this.color} cat"
        }
    }
}

// Test it out

val cat = new Cat(false, "yellow")
val dog = new Animal("black")

println(cat)
println(dog)