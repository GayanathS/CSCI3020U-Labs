class Animal(c: String) {
	override def toString(): String = {
		s"a ${c} animal"
	}
}

class Cat(strip:Boolean, c:String)extends Animal(c) {
	override def toString(): String = {
		if (strip)
			s"a striped ${c} cat"
		else
			s "a solid ${c} cat"
	}
}