import scala.io.StdIn

object Basico extends App {
	/*
		Linha de Comando - I/O
	*/

	// Saida sem adicionar nova linha
	print("Segundo Olá Mundo...")
	
	// Saida Padrao
	println("Primeiro Olá Mundo em Scala")

	/* 
		Entradas
	 	Para colher dados da linha de Comando
		é preciso importar a função `readLine`
		que está no pacote: `scala.io.StdIn`
		É importante fazer essa importação no
		inicio do programa
	*/
	val saldacao = "Seu Primeiro input é: "
	val input = StdIn.readLine(saldacao)
	println(f"Isso Mesmo: $input")


	/*
		Em Scala $var declara uma variavel mutavel
		enquanto $val decalra uma variavel imutavel
	*/

	// Imutaveis
	val nacimento: String = "30/04/1997"
	val nome: String = "Lucas"

	// Mutaveis
	var idade: Int = 23000
	var estadoCivil: String = "casado"

	// Interpolação de String
	val seqLetra = "Fr2ase Qualquer"
	val stringInterpolada = s"Salvando uma $seqLetra"

	// Interpolando Expressoes
	val a = 1
	val b = 2
	val expressoesInterpoladas = s"Soma $a e $b é: ${a + b}"

	/* 
	   String MultiLinhas
	   usar $| + .stripMargin resolve o problema 
	   formatação na tela
	*/
	val s = """String
						|de
						|varias
						|linhas""".stripMargin
}