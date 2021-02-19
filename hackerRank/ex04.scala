object Solution {
    def numberAvailable(n: Int) = {
        if(n % 2 == 0) {
            n match {
                case n if(2 to 5 contains n) => "Not Weird"
                case n if(6 to 20 contains n) => "Weird"
                case n if(n > 20) => "Not Weird"
            }
        } else {
            "Weird"
        }
    }


    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val N = stdin.readLine.trim.toInt
        
        val response = numberAvailable(N)
        
        println(response)
    }
}
