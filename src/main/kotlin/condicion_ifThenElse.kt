fun main() {
    // clase de if then else
    println("-------- Condicio if then else-------- ")
    // se puede hacer un refactor con la variable con boto derecho del mouse refactoring and rename, cambia la variable
    var miNumero = 100

    println("--------- If con mayor que-----------")
    if (miNumero >= 150) {
        // es cuando la condicion es verdadera  entra aca
        println("El numero es mayor igual a 150")
        println(miNumero)
    } else if (miNumero > 90) {
        println("El numero es mayor a 90")
    } else {

        //Es cuando la condicion de la expresion no  cumple, entra aca
        println("todas las condiciones fallaron")
        println(miNumero)
    }

    println("---------- if con menor que ------------")
    if (miNumero <= 150) {
        // es cuando la condicion es verdadera  entra aca
        println("El numero es menor igual a 150")
        println(miNumero)
    } else if (miNumero < 90) {
        println("El numero es menor a 90")
    } else {
        //Es cuando la condicion de la expresion no  cumple, entra aca
        println("todas las condiciones fallaron")
        println(miNumero)
    }

    println("---------usuario activo example--------")

    val isActive = true
    if (!isActive) {
        println("Usuario activo")
    } else {
        println("Usuario no activo")
    }

    println("----------- Operador Logico AND  && -------------")
    val isPlaying = true
    val score = 80

    if (isPlaying && score == 100) {
        println("Siguiente nivel abierto")
    } else {
        println("Sigues en el mismo nivel")
    }


    println("----------- Operador Logico OR ||  -------------")
    val num1 = 5
    val num2 = -4

    if (num1 > 0 || num2 > 0) {
        println("La condicion es true")
    } else {
        println("La condicion es false")
    }

    println("---------- Con expresion en variable--------")
    // este parametro es uno de return de tipo expresion regular
    val text = if (num1 > 0 || num2 > 0) "Esto es un text1" else "Esto es un text2"
    println("$text")

    
}