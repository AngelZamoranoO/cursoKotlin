fun main() {
    // vamos a ver tipos de datos
    // es de tipo entero Integer
    var number: Int = 22
    // se llama a un metodo de maximo valor del integer
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE

    // muestra el rango de valores que se puede programar en Integer
    println("Integer con el maximo valor -> $maxIntegerValue")
    println("Integer con el minimo valor -> $minIntegerValue")
    // si le sumo 1 al valor maximo de Integer 2147483648 tiene un error de tipo
    //The integer literal does not conform to the expected type Int
    //number=2147483648

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    //tiene que mostrar el maximo y minimo tipo Byte
    println("Byte con el maximo valor -> $myMaxByteValue")
    println("Byte con el minimo valor -> $myMinByteValue")

    val myMaxShortValue:Short = Short.MAX_VALUE
    val myMinShortValue: Short= Short.MIN_VALUE

    // Muestra el valor maximo y minimo del tipo Short
    println("Short con el maximo valor -> $myMaxShortValue")
    println("Short con el minimo valor -> $myMinShortValue")

    val myMaxLongValue:Long = Long.MAX_VALUE
    val myMinLongValue: Long= Long.MIN_VALUE
    // muestra el valor maximo y minimo de long
    println("Short con el maximo valor -> $myMaxLongValue")
    println("Short con el minimo valor -> $myMinLongValue")

    val i = 28
    val myNumber: Any= i
    println("${myNumber::class.simpleName} corresponde a la variable $myNumber") // funcion para saber el tipo de dato.

    println("-------------- Float and Double----------------")
    // es de tipo double
    val myDoubleNumber=1.5
    // para asignar que el numero es float se debe poner en el valor un f. sin la f seria un valor de tipo Double
    val myFloatNumber:Float=1.5f
    // si es con un entero

    println("myDoubleNumber = $myDoubleNumber es de tipo -> ${myDoubleNumber::class.simpleName}")
    println("myFloatNumber = $myFloatNumber es de tipo -> ${myFloatNumber::class.simpleName}")

    val myMaxFloatValue: Float = Float.MAX_VALUE
    val myMinFloatValue: Float = Float.MAX_VALUE
    // muestra el valor maximo y minimo de flotante
    println("Float con el maximo valor -> $myMaxFloatValue")
    println("Float con el minimo valor -> $myMinFloatValue")

    val myMaxDoubleValue: Double = Double.MAX_VALUE
    val myMinDoubleValue: Double = Double.MAX_VALUE
    // muestra el valor maximo y minimo de flotante
    println("Double con el maximo valor -> $myMaxDoubleValue")
    println("Double con el minimo valor -> $myMinDoubleValue")



}