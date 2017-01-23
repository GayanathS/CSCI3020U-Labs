import scala.io.Source
import scala.io.BufferedSource

val Filename = args(0)
val dayentered = args(1)
val starttime = args(2)
val endtime = args(3)

for (line <- source.getLines()) 
	val starthour = line.split('|').getLines(4)
	val day = line.split('|').getLines(5)
	val endhour = line.split('|').getLines(8)
	val coursecode = line.split('|').getLines(3)
	val roomnumber = line.split('|').getLines(9)

if (starthour == starttime && endtime = endhour && dayentered = day )
	val roomnumber = Source.fromFile(Filename).getLines.flatMap(x => x.split('|')).getLines(9).toList.groupBy(x=>x).mapValues(x=>x.length)

if (dayentered == M) 
	println("No class from 10a.m to 12 p.m")

while (line <- source.getLines())
	if (dayentered = line.split('|').getLines(4) && starttime = line.split('|').getLines(4) && endtime = line.split('|').getLines(8))
		println("List of available rooms are" + roomnumber)
	
// I wasn't too sure how to do this program but i had a general idea of how to implement 
// it but i couldn't turn it into code
// I was thinking that you take in the 4 arguements
// Then filter the  txt file based on the starttime endtime and day
// get specific room numbers based on the filter and split
// finally determine weather or not the room is free at the time by checking if any courses 
// are occuring during that time
// and print the empty rooms	






		
