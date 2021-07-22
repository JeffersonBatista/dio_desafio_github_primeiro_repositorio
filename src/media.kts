import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)

    val a:Double = reader.nextDouble()
    val b:Double = reader.nextDouble()

    val weightA = 3.5
    val weightB = 7.5
    val totalWeight = 11.0

    var m = ((a *  weightA) + (b * weightB)) / totalWeight

    var r = "%.5f".format(m)

    println("MEDIA = ${r}")
}