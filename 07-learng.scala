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

// Impreção
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