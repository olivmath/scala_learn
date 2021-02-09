object Ifelse extends App {
   	/*
	If's são blocos de condições que podem desviar o fluxo
	de execução do seu programa.

	Em Scala se usarmos $else_if dentro de uma função
	temos que adicionar um $else.
	*/
	def typeNumber(a: Int): String = {
		/*
		Existem algumas formas de escrevermos condicionais
		*/
		if(a % 2 == 0) "é par"
		
		else if(a % 2 == 1) {
			"é impar"
		}
		else
			""
	}

	println(typeNumber(7))


	val x = 8

	if(x % 2 == 0)
		println(s"$x É PAR")
	else if(x % 2 == 0)
		println(s"$x É IMPAR")
}