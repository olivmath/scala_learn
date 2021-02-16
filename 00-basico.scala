import scala.io.StdIn

object Basico extends App {
	/*
		[Val, Var, Lazy]
		
		- Em Scala $var declara uma variavel mutavel
		  enquanto $val declara uma variavel imutavel
		- Você pode usar $lazy para inicializar uma
		  variavel apenas no momento em que ela é chamada

		
		[Input, Output]

		- Podemos umas $print e $println para imprimir dados  	
	 	- Para colher dados da linha de Comando é preciso
	 	  importar a função $readLine no início do programa

		[String Multlinhas, Interpolação, Fstring, Raw]
		
	   	- Usar $| + $.stripMargin resolve o problema de 
	   	  formatação na tela
	   	- o simbolo $ permite imprimir variaveis dentro de strings
	   	- ${} é usados para executar expressões em strings
		- Para arredondar numeros em string usamos %.Nf onde
		  N é o numero de numeros atras do ponto
		- $raw permite que simbolos sejam impressos
		
	*/

	// Output sem adicionar nova linha
	print("Segundo Olá Mundo...")
	
	// Output Padrao
	println("Primeiro Olá Mundo em Scala")

	// Input
	val saldacao = "Seu Primeiro input é: "
	val input = StdIn.readLine(saldacao)
	println(f"Isso Mesmo: $input")

	// Imutaveis
	val nacimento: String = "30/04/1997"
	val nome: String = "Lucas"

	// Mutaveis
	var idade: Int = 23000
	var estadoCivil: String = "casado"

	// Lazy
	lazy var x = 321

	// .stripMargin
	val s = """String
						|de
						|varias
						|linhas""".stripMargin

	// Interpolação de String
	val seqLetra = "Fr2ase Qualquer"
	val stringInterpolada = s"Salvando uma $seqLetra"

	// Interpolando Expressoes
	val a = 1
	val b = 2
	val expressoesInterpoladas = s"Soma $a e $b é: ${a + b}"

	// Fstring
	val pi: Double = 3.1415987
	val fString = f"Pi: $pi%.2f"

	// Raw
	val nRaw = "\nLinha 1\nLinha 2"
	val yRaw = raw"\nLinha 1\nLinha 2"


}