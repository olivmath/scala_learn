object Functions extends App {
	/*
		Para declarar uma função é recomendado declarar
		o tipo dos parametros e o tipo que ela retorna 
	*/

	def minhaFunc(idade: Int, nome: String): List[Any] = {
		List(idade, nome)
	}

	println(minhaFunc(23, "Lucas"))
}