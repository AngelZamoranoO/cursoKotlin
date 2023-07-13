fun main() {
    println("---------------When-----------")
    // esta sentencia es como un parametro switch es de multicasos
    val alarma = 2

    println("When  de 1 sentencia")
    when (alarma) {
        //aca va una exprecion de tiro flecha.
        1 -> println("El tiempo es $alarma")
        // Agrupacion de numeros
        12, 7, 14 -> println("El tiempo es $alarma")
        // Puede ser en rango
        in 1..10 -> println("La alarma esta en el rango de 1..10")
        // tambien se puede negar el valor
        !in 1..10 -> println("La alarma esta en el rango de 1..10")
        else -> println("El sin alarma")

    }

    println("When multiples sentencias y asignada a una variable")
    val alarmaDos = 10
    // se puede asignar la expresion en una variable
    val text = when (alarmaDos) {
        in 2..5 -> {
            println("La alarma esta en el rango de 1..10")
            println("Exit")
        }

        12, 7, 14, 10 -> {
            println("La alarma es $alarmaDos")
            println("Exit")
        }

        else -> {
            println("el valor no existe o la alarma no cumple con los rangos")
            println("Exit")
        }
    }
    println("text -> $text")

    println("When on exprecion booleana")
    val alarmaTres = 12
    // el siguiente when es con validacion booleana
    when {
        alarmaTres <= 10 -> {
            println("La alarma esta en el rango de 1..10")
            println("Exit")
        }

        alarmaTres == 12 || alarmaTres == 7 -> {
            println("La alarma es $alarmaTres")
        }

        else -> {
            println("el valor no existe o la alarma no cumple con los rangos")
        }
    }

}