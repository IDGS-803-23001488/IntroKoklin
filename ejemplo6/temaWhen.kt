fun main(args: Array<String>) {
    print("Ingrese coordenada x del punto:")
    val x = readLn().toInt()
    print("Ingrese coordenada y del punto:")
    val y = readLn().toInt()
    when{
        x > && y > 0 -> println("Primer cuadrante")
        x < && y > 0 -> println("Segundo cuadrante")
        x < && y < 0 -> println("Tercero cuadrante")
        x > && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}// java -jar nom.jar