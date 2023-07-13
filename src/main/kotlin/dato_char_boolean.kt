fun main() {
    // la clase de hoy es probar con tipos de datos Char y Booleano

    //Tipo de dato Char, en el Char se realiza con las comillas Simple '', y puede contener Letra,Numero, Caracter
    // Especial
    //Se puede reconocer de ambas formas,
    val myCharValue:Char
    val mySecondCharValue = 'D'

    myCharValue = '2'

    println("------- Char ------------")
    println("myCharValue -> $myCharValue,  de tipo ${myCharValue::class.simpleName}")
    println("mySecondCharValue -> $mySecondCharValue,  de tipo ${mySecondCharValue::class.simpleName}")

    // el clasico booleano del true o false
    // esta el dato como primitivo o implicito
    val myBooleanValue:Boolean
    val mySecondBooleanValue = true

    myBooleanValue = false

    println("------- Booleano ------------")
    println("myBooleanValue -> $myBooleanValue,  de tipo ${myBooleanValue::class.simpleName}")
    println("mySecondBooleanValue -> $mySecondBooleanValue,  de tipo ${mySecondBooleanValue::class.simpleName}")






}