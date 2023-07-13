fun main() {
    println("--------------NULL-------------")

    // se trabaja con nullpoint
    // exception
    // Al poner un interrogacion dice que el valor es cuestionable, si es un String o Null
    val text: String? = "Nombre"

    // no se puede declara por que es un numero que puede recibir numero nulo
    //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(text?.length) // es la forma para decir que el valor puede ser null o dato
    // es cuando el valor no tiene que ser null
    var text2: String? = null
    text2 = "Angel"
    println(text2!!.length) //esto llama un valor nulo si o si y siempre tiene un nullexception


    // se soluciona con la sentencia if, aplica una discrimacion el cual se controla el numero nulo o valor nulo
    var segundoText: String? = "Angel"
    //segundoText = null

    if (segundoText != null) {
        println("valor no es Null")
        println(segundoText.length)
    } else {
        println("La variable es Null")
    }

    println("la mejor forma del manejo de null es la siguiente")
    var text3: String? = null
    //text3 = "tengo datos,  no soy null"
    val text4 = text3 ?: "Este valor es nulo"
    // respresenta como un if si caputa valor o no, si tiene un null esribe este texto

    /*
    * Es como decir el ejemplo de la linea 32
    * if (text3 !=null){
    *   text4 = text3
    * }else{
    *   text4 = "Este valor es nulo"
    * }
    * */
    println(text4)
}