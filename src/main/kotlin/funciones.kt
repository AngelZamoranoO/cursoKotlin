fun main() {
    println("-----------funciones-----------")
    println("----- FUNCION SIN PARAMETROS-----")
    // esta funcion se invoca normal con el nombre de la funcion creada, y puede ser de cualquier tipo de dato
    diHola()

    println("----- FUNCION CON PARAMETROS-----")
    println("Ingresa el valor")
    var name = readlnOrNull() ?: "el nombre es de tipo String"
    saludo(name,37)

    println("----- FUNCION CON PARAMETROS-----")
    val hasInternetConection = false
    if (hasInternetConection) {
        getData("Data info")
    } else {
        showMessage()
    }


}

fun diHola() {
    println("Hola, Como estas?== funcion sin parametro")
}

fun saludo(name: String, edad: Int) { // los parametros son val
//    var number = edad
//    number = 2    de esta forma se puede cambiar los valores dentro de la funcion
    println("Hola, como estas $name y la edad es $edad == es una funcion con parametro")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("Theres not conection to internet")

}