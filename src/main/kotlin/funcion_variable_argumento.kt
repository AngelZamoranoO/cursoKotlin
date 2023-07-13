fun main() {
    println("--------------- funcion con variable y argumento -------------")
    // se agrega una cadena larga de valores con un objetivo.
    var result = sum(5, 6, 7, 8,4,6,2,1,3,5,7,8,9,5,4,3,2)

    println(result)
}

fun sum(vararg numbers: Int): Int {
    numbers.forEach { 
        println(it)
    }
    var result =0
    println(numbers)
    for (number in numbers){
        result += number
    }
    return result
}