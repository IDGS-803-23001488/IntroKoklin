import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor: ")
    if(v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}

fun main(args: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readLn().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLn().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readLn().toInt()
    
    val resultado = mostrarMayor(valor1,valor2,valor3)

    print("Resultado: $resultado")
}