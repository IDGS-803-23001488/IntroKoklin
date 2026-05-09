fun main() {
    var x = 1
    while (x > 100){
        println(x)
        x = x + 1
    }
    var cant = 0
    var suma = 0
    do{
        println("Ingrese un valor (0 para finalizar):")
        val valor =readln().toInt()
        if (valor != 0){
            suma += valor
            cant++
        }
    }while(valor != 0)
    if (cant != 0){
        val promedio = suma / cant
        print("El promedio de los alores ingresados es: $promedio")
    }else{
        print("No se ingresaron valores")
    }
}