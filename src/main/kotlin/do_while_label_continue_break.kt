fun main() {
    println("-------------- do while label continuo break, esquema de loop ---------------")
    var number = 0
    while (number < 3) {
        println(number)
        number++
    }
    println("-----------------------")
    number = 0
    while (number < 3) println(++number)

    println("-----------------------")
    number = 0

    do {
        println(number++)
    } while (number < 3)

    println("-----------------------")
    // el continue continua ejecutandose el programa, que continua el ciclo
    number = 0
    while (number < 3) {
        number++
        if (number == 2) {
            println("entre al continue y empieza el ciclo nuevamente, pero no imprime el valor")
            continue
        }
        println(number)

    }
    println("-----------------------")
    // el break termina el loop,
    number = 0
    while (number < 3) {
        number++
        if (number == 2) {
            println("termina el ciclo")
            break
        }
        println(number)
    }
    println("Me sali del ciclo, fin del programa")
    println("-----------------------")

    for (i in 1..5) {
        if (i in 3..4) {
            continue
        }
        println(i)
    }
    println("-----------------------")

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }
    println("Fin del ciclo")
    println("------------LOOP SOBRE LOOP-----------")
    number = 0
    while (number < 3){
        println("while -> $number")

        var i =0
        for (i in 1..3){
        }
    }


}
