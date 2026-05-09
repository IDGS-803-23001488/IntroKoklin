/* La distancia entro dos puntos */

import kotlin.math.*

fun main() {
    val x1 = 0.0
    val y1 = 0.0
    val x2 = 3.0
    val y2 = 4.0

    val distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    
    println("La distancia es: $distancia")
}