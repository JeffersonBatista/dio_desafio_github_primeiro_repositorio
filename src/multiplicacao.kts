fun main(args: Array<String>) {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    // println("PROD = ${a * b}")   - Maneira mais simples de resolver
    println("PROD = " + multiplicar(a,b))
}

fun multiplicar(a: Int, b: Int) = a * b // Função criada para resolver o mesmo problema em escala