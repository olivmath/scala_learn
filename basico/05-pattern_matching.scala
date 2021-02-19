object PatternMatching extends App {
	/*
		[match expression]
		É usado como um padrão de correspondencia
		Seu uso é muito versatil pode ser usado em
		conjunto com funções, condicionais $if_else,
		loops $for e $while
	*/

	// match padrão simples
	def mes(number: Int): String = {
		number match {
			case 1 => "janeiro"
			case 2 => "fevereiro"
			case 3 => "março"
			case 4 => "abril"
			case 5 => "maio"
			case 6 => "junho"
			case 7 => "julho"
			case 8 => "agosto"
			case 9 => "setembro"
			case 10 => "outubro"
			case 11 => "novembro"
			case 12 => "dezembro"
			case _ => s"Numero $number invalido"
		}
	}
	println(mes(12))


	// match com $if_else
	def matchCondicionais(nome : String) = {
		nome match {
			case "Brahma" | "Skol" => "Não Gosto"
			case "Heineken" | "Budwiser" => "Gosto"
			case _ => "Só tem essa?" 
		}
	}
	println(matchCondicionais("Imperio"))
	

	// match complexo com $if_else
	def matchCondicionaisComplexo(nome: String) = {
		nome match {
			case nome if(nome.endsWith(".txt") & nome.startsWith("_")) =>
				"String Muito Suja"
			case nome if(nome.endsWith(".txt") | nome.startsWith("_")) =>
				"String Suja"
			case nome  if(!nome.endsWith(".txt") & !nome.startsWith("_")) =>
				"String Limpa"
		}
	}
	println(matchCondicionaisComplexo("_Lucas"))

} 