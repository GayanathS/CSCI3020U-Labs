// Gayanath Sasitharanathan //
// 100490365 //

import scala.io.Source
import scala.io.BufferedSource

val Filename = args(0)

val source = Source.fromFile(Filename)
//val distinctcode = source.map(line => {
	//val code = line.split("\t") 
	//})
	//.foreach (println)//


//val counts = Filename.flatMap(line => line.split(" "))
                 //.map(word => (word, 1))
                 //.reduceByKey(_ + _)

for (line <- source.getLines())
	println(line)
	//println(source.split("2").toList.groupBy(w => w).mapValues(_.length))
source.close//

val counts = Source.fromFile(Filename).getLines.flatMap(x => x.split('|')).toList.groupBy(x=>x).mapValues(x=>x.length)

println(counts)

