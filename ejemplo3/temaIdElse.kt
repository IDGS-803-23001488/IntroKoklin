fun main(){
    println("Ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if(sueldo > 200){
        println("Paga inpuestos")
    }else{
        println("No Paga inpuestos")
    }
    
    /*
        >, <, <=, >=, ==, !=
        +, -, *, /, %
    */

    val a = 3
    val b = 5
    val mayor = if(a > b) a else b
    println("El numero mayor entre $a y $b es $mayor")
}