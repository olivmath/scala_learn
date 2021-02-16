object Loops extends App {
	/*
		[range]
		Range são intervalos de valores bem delimitados
		que podem nos ajudar muito quando trabalhamos com
		sequecias de numeros ou caracters
		Range's podem ser facilmente transformados em
		Collections usando .toList or .toArray or .toSeq

		[to, until, by]
		Usando $to o laço percorre o range de valores
		de forma inclusiva,	$until corre sobre o range
		de forma exclusiva e $by determina o passo da 
		sequencia

		[for]
		Em Scala o loop $for tem algumas caracteriscas
		interessantes

		- Gerar renges inclusivos e exclusivos
		- Adicionar Condicionais $if
		
		[if]
		Podemos adicionar $if no laço for para fazer algum
		tipo de filtragem

		[yield]
		Usado quando queremos armazenar os retornos de um
		laço for

		[while, do while]
		São outro tipo de laço de repetição, porém necessitam
		de contador
	*/

	// transformamdo
	val seq: Seq[Int] = (0 to 10).toSeq
	val list: List[Int] = (10 until 100).toList
	val arr: Array[Int] = (-15 to 0 by 2).toArray

	// To
	for(i <- 0 to 10)
		print(s"$i ")

	// Until
	for(i <- 0 until 10)
		print(s"$i ")

	// by
	for(i <- 0 until 10 by 2)
		print(s"$i ")

	// for
	val lista = List("item1", "item2", "item3", "item4")
	for(item <- lista)
		print(s"$item ")

	// Condicionais
	val lista_nomes = Lista("Lucas", "Joao", "Jose", "Maria", "Lucas")
	for(nome <- lista_nomes if nome == "Lucas")
		print(s"$nome ")

	// Yield
	val a = for(i <- 0 until 5) yield i
	print(a)

	// Condicionais + Yield
	val nomes = List("Lucas", "_Maria", "_Jose", "Joao", "Pedro_","Mario","Joaquim_", "Ana", "_Gean")
	val nomeLimpo = for {
		nome <- nomes
		if(nome.head != '_' && nome.last != '_')
	} yield nome
	
	// for aninhados
	val dim2 = Array(Array(1, 2), Array(10, 20), Array(100, 200))
	for {
		x <- 0 until 3
		y <- 0 until 2
		} println(s"${dim2(x)(y)}")

	// while
	var contator = 10
	while(contator > 0) {
		print(s"$contator ")
		contator -= 1
	}

	// do while
	var contator = 0
	do {
		contator += 1
		print(s"$contator ")
	} while(contator < 10)
}