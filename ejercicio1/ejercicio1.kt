/*La operacion de multiplicacion de a por b usando sumas */

fun main() {
    print("Ingrese num1:")
    val num1 = readLn().toInt()
    print("Ingrese num2:")
    val num2 = readLn().toInt()
    
    var producto = 0
    for (i in 1..num2) {
        producto += num1
    }

    println("$num1 x $num2 usando sumas es: $producto")
}
