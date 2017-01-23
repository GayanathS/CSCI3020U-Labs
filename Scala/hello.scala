class Eval(cond:Boolean) {

	def apply(code: =>Unit){
		if (cond) {
		    code
		}else{
		    println("Not evaluating...")
		}
	}
}

class Branch {
	var yesCount = 0
	var noCount = 0
	def apply(cond: =>Boolean):Eval = {
		val c = cond
		if(c) {
			yesCount += 1
		}else {
		 	noCount += 1
		}
		new Eval(cond)
	}
}

val IF = new Branch()


IF (1 != 1) {
	for (i <- 1 to 10){
	   println("ding")
	}
}

println ("yeses: " + IF.yesCount)
println ("nos:" + IF.noCount)
