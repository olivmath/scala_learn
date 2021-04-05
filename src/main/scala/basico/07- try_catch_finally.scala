object TryCatch extends App {
	/*
		As expressões $try, $catch e $finally são usadas para
		tratamento de erros.

		[Try]

		Contem o código pode retornar uma exeção

		[Catch]

		Captura o a exeção e retorna algo, podem ser mesclado
		com expressões $match de forma muito util

		[Finally]

		Bloco executado independente se houver exeção ou não 
	*/
	
	def soma(x: Int, y: Int) = {
		x / y
	}

	try {
		val x = soma(0, 0)
		println(x)

	} catch {
		case e : ArithmeticException => println(s"[ERROR]:\n=>$e")
		case _ : Throwable => println("[ERROR]")

	}finally {
		println("Final COM ou SEM erros")
	}
}