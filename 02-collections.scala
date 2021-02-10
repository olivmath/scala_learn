import scala.collection.mutable.ArrayBuffer

object Collections extends App {
	/*
		Collections são os estruturas de dados
	*/

	def sortAlg(arr: Array[Int]): Array[Int] = {
		for(i <- 0 to arr.length)
			for(j <- 0 to arr.length)
				if(arr(i) > arr(j)) {
					println(arr(i))
				} else {
					println(arr(j))
				}
		arr
	}

	var arr = Array(9,8,5,6,4,11,2,3133,987,125,45,62,33)
	println(sortAlg(arr))

}