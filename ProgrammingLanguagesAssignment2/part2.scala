// Gayanath Sasitharanathan //
// 100490365 //

import scala.io.Source
import scala.io.BufferedSource

val Filename = args(0)
val courecode = args(1)
val source = Source.fromFile(Filename)

for (line <- source.getLines()) 
	val starthour = line.split('|').getLines(4)
	val day = line.split('|').getLines(5)
	val endhour = line.split('|').getLines(8)
	val coursecode = line.split('|').getLines(3)
	 
		
if (coursecode = (line.split('|').getLines(3)))
	println("The start hour is " + starthour)
	println ("The end hour is " + endhour)
	println ("The days are " + day)




	
