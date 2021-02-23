import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the solve function below.
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int)=  
    {
        val total_tip: Double = meal_cost * tip_percent.toDouble / 100.0
        val total_tax: Double = meal_cost * tax_percent.toDouble / 100.0
        val total: Double = meal_cost + total_tip + total_tax
        
        total.round

        
    }

    def main(args: Array[String]) {
        val funcao = scala.io.StdIn

        val meal_cost = funcao.readLine.trim.toDouble

        val tip_percent = funcao.readLine.trim.toInt

        val tax_percent = funcao.readLine.trim.toInt

        println(solve(meal_cost, tip_percent, tax_percent))
          
    }
}
