import scala.io.StdIn.readLine

object Ifelse extends App {
   	/*
		If's são blocos de condições que podem desviar o fluxo
		de execução do seu programa.

		Em Scala se usarmos $else-if dentro de uma função
		temos que adicionar um $else.
		
		Existem varias formas diferentes de
		escrevermos as condicionais $if-else

		[e, ou, not]
		not   ==    !
		or    ==    |
		e     ==    &
	*/
	def funcNumero(a: Float): String = {
		if(a % 2 == 0) "é par"
		
		else if(a % 2 == 1) {
			"é impar"
		}
		else
			"Menor que 1"
	}
	
	println(funcNumero(7))


	/*
		Em Scala não é preciso usar um operador
		ternário pois `if-else` sempre retornam
		resultados
	*/

	val a = if(7 > 5) "Verdadeiro" else "Falso"
	println(a)

}