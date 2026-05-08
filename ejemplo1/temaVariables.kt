fun main(){
    val saludo: String = "Hola" // Inmmutable
    val nombre: String = "Kotlin" // Mutable
    println("$saludo $nombre")


    // Lectura de datos por consola
    println("Ingresa primer numero")
    val num1 = readln().toInt()
    println("Ingresa segundo numero")
    val num2 = readln().toInt()

    var res = num1 + num2
    println("La suma es: $res")
}