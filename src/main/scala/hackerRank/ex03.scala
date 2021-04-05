object Solution {

    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) = {
        val total_tip: Double = meal_cost * tip_percent.toDouble / 100.0
        val total_tax: Double = meal_cost * tax_percent.toDouble / 100.0
        val total: Double = meal_cost + total_tip + total_tax
        
        total.round
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val meal_cost = stdin.readLine.toDouble

        val tip_percent = stdin.readLine.toInt

        val tax_percent = stdin.readLine.toInt

        val solved = solve(meal_cost, tip_percent, tax_percent)
        
        println(solved)
    }
}