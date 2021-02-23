//Função

/*val a = 4
val b = 3
a + b
2 + 2
val x = 19 * 30
x + a


def c = 2 + 5

var d = "abcd"

*/

// Impressão
/*
println("Olá Mundo")
*/

 //Interpolação de string
val n = 45
s"Eu tenho $n cuecas"

// Controle de Fluxo
/*
val r = 1 to 5
r.foreach(println)
*/

// Um loop while
/*
var i = 0
while (i < 10) { println("i" + i); i += 1}
while (i < 10) { println("i" + i); i += 1}
// Sim, de novo. O que aconteceu? Por quê?
i    // Exibe o valor de i. Note que o while é um loop no senso clássico -
     // executa sequencialmente enquanto muda a variável do loop. While é muito
     // rápido, mas usar os combinadores e compreenões acima é mais fácil
     // para entender e paralizar
*/

// Um loop do-while

i = 0
do {
  println("i ainda é menor que 10")
  i += 1
} while (i < 10)


// Day 1 hackerrank

// Sample Input

/*
12
4.0
is the best place to learn and practice coding!
*/

// Sample Output

/*
16
8.0
HackerRank is the best place to learn and practice coding!
*/

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
                
        // Print the sum of both the integer variables
        println (12 + i)
        
        // Print the sum of both the double variables
        println (d + d)
        
        // Concatenate and print the string variables
        println (s + "is the best place to learn and practice coding!")
        
        // The 's' variable above should be printed first.
    }
}


