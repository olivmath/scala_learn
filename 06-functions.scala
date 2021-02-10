object Functions extends App {
	/*
		Para declarar uma função é recomendado declarar
		o tipo dos parametros e o tipo que ela retorna 
	*/

	def minhaFunc(idade: Int, nome: String): List[Any] = {
		List(idade, nome)
	}

	println(minhaFunc(23, "Lucas"))

	// Funções Lambdas ou Anonimas
	val div = (x: Int, y: Int) => if(x > y) x / y else y / x
	val mult = (x: Int, y: Int) => x * y
	val sub = (x: Int, y: Int) => if(x > y) x - y else y - x
	val soma = (x: Int, y: Int) => x + y


	println(soma(3,5))
	println(sub(3,5))
	println(div(3,5))
	println(mult(3,5))
}