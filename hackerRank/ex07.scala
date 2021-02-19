object Solution {
    def solve(str: String) = {
        var strPar = ""
        var strImpar = ""
        str.foreach(
            i => if(str.indexOf(i) % 2 == 0) {
                strPar += i
            } else {
                strImpar += i
            })
        List(strPar, strImpar)
    }
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.         Your class should be named Solution
        */
        val std = scala.io.StdIn
        
        val n = std.readLine().trim.toInt
        
        val inputs = for(i <- 0 until n) yield std.readLine().trim
        
        val strManipulated = for(i <- inputs) yield solve(i)
        
        println(strManipulated)
        
    }
}