import java.util.Scanner

fun main(args: Array<String>){
    val number = Scanner(System.`in`)
    val a = number.nextInt()
    val b = number.nextInt()

    println("SOMA = ${a + b}")
    // println("SOMA = " + somar(a,b))  - Chamando uma função dedicada
}

fun somar(a: Int, b: Int) = a + b