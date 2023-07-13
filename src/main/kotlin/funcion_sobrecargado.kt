fun main() {
    println("------------- Funciones de sobrecargado o overloading --------")
    // escribir la misma funcion pero los parametros hacen match para ver con cual funcion trabajar
    val min = getMin(4.3, 9.2)// depende el tipo de dato escoje la funcion o realiza el scope

}

// al no definir el tipo la funcion automaticante lo devuelve como un INT, ya que al devolver la variable es un INT
fun getMin(a: Int, b: Int) = if (a < b) a else b

// al cambiar el tipo de dato
fun getMin(a: Double, b: Double) = if (a < b) a else b

fun getMin(a: Int, b: Int, c: Int): Int {
    return if (a <= b && a <= c) {
        a
    } else if (b <= a && b <= c) {
        b
    } else {
        c
    }
}