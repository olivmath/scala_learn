object PatternMatching extends App {
	/*
		
		
	*/

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
	
} 