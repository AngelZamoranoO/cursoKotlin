fun main() {
    // variable tienen que ser con camelCase asignar el tipo de dato = asigna valor en memoria
    // variables son asignadas con typo son implicitas
    var userName: String = "Angel"
    //cambio del valor en la variable
    userName = "Camila"

    // al asignar a userName valores diferente coomo un Int o Booleano
    // The integer literal does not conform to the expected type String
    //userName=3

    // el valor no puede ser reasignado, es como una constante
    val secondName: String = "Felipe"
    //Val cannot be reassigned
    //secondName = ""

    var age: Int = 37
    //Se ingresa valores errores tiene el siguiente mensaje de error
    // Type mismatch. Required: Int  Found: String
    //age= ""

    // el string tambien se puede identificar de esta forma
    var lastName = "Zamorano"
    var birthday = 22
    // y tiene las mismas restricciones al asignar valores a variables
    //lastName=2
    //birthday=true

    println("Hola, $userName !")
}