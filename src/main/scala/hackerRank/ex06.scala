object Solution {
    def solve(n: Int): Unit ={
        for(i <- 1 to 10) {
            println(s"$n x $i = ${n * i}")
        }
    }


    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt
        
        solve(n)
    }
}