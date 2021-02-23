object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
                
        // Print the sum of both the integer variables
        val i2 = scala.io.StdIn.readLine().toInt
        println (i + i2)
        
        // Print the sum of both the double variables
        val d2 = scala.io.StdIn.readLine().toDouble
        println (d + d2)
        
        // Concatenate and print the string variables
        val s2 = scala.io.StdIn.readLine()
        println (s + s2)
        
        // The 's' variable above should be printed first.
    }
}
