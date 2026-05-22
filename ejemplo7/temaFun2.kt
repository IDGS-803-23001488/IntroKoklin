fun mostrarPerimetro(lado : Int){
    val perimetro = lado *4;
    println("El perimetro es: $perimetro")
}

fun mostraSuperficie(lado : Int){
    val superficie = lado * lado;
    println("El superficie es: $superficie")
}

fun main(){
    print("Ingrese el valor del lado de un cuadrado:")
    val valor1 = readln().toInt()
    print("Quiere calcular el perimetro o la superficie:[ingresa texto: perimetro/superficie]")
    val respuesta = readln()
    when(respuesta){
        "perimetro" -> mostrarPerimetro(valor1)
        "superficie" -> mostraSuperficie(valor1)
    }
}