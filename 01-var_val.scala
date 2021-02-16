object VarVal extends App {
	/*
<<<<<<< HEAD
=======
		Em Scala $var declara uma variavel mutavel
		enquanto $val decalra uma variavel imutavel
	*/

	// Imutaveis
	val nacimento: String = "30/04/1997"
	val nome: String = "Lucas"

	// Mutaveis
	var idade: Int = 23000
	var estadoCivil: String = "casado"

	/*
>>>>>>> f27bf995e9f4c1b8e3e463e7ed95a36db8e95fc0
		Tipos de Variaveis:
	*/

	// Boolean
	val p: Boolean = true

	// Byte
	val b: Byte = 1

	// Char
	val letra: Char = 'a' // Aspas Simples para Char

	// String
	val seqLetra: String = "Frase Qualquer" // Aspas Duplas para String

	// Short
	val numeroPequeno: Short = 123

	// Int
	val numero: Int = 62000

	// Long
	val numeroGrande: Long = 12000300L

	// Float
	val fracao: Float = 3.1415F

	// Double
	val fracaoPrecisa: Double = 3.1415639574D

	// Unit
	val nada: Unit = ()

}