fun main() {
    println("----------funciones con retorno ---------")
    // al solicita una funcion me debe retornar un valor
    val max = getMax(5, 9)
    println(max)

    println("------segunda forma de una funcion con return-------")
    println(getMaxSegundo(5, 9))

    println("-------tercera forma de una funcion con return de un solo objeto")
    println(getMaxTercero(5,3))
}

// al asignar parametros debo definir el tipo de valor que quiero que retorne
fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    println("Antes del return")
    return max
    println("despues del return")
}

fun getMaxSegundo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun getMaxTercero(a: Int, b: Int): Int = if (a > b)  a else  b