fun main() {
    // clase de Operadores
    println("----------Operadores----------")
    // si se ejecuta una variable entera con una double el resultado sera double
    var x = 5
    val y = 2

    var result = x + y
    println("result -> $result")
    println("result puede ser asi x+y= ${x+y} puede ser expresion")
    println("result puede ser asi x-y= ${x-y} puede ser expresion")
    println("result puede ser asi x*y= ${x*y} puede ser expresion")
    println("result puede ser asi x/y= ${x/y} puede ser expresion")
    println("result puede ser asi x%y= ${x%y} puede ser expresion")

    println("---------  +  ------------")
    println("result antes vale -> $result")
    result = result+2
    println("result = result+2 despues vale -> $result")

    println("----------  -  -----------")
    println("result antes vale -> $result")
    result = result-2
    println("result = result-2 despues vale -> $result")

    println("----------   *   -----------")
    println("result antes vale -> $result")
    result = result*2
    println("result = result*2 despues vale -> $result")

    println("---------   /   ------------")
    println("result antes vale -> $result")
    result = result/2
    println("result = result/2 despues vale -> $result")

    println("--------   %  -------------")
    println("result antes vale -> $result")
    result = result%2
    println("result = result%2 despues vale -> $result")

    //remplao del valor  es de esta forma
    println("===============================")

    println("---------  +=  ------------")
    println("result antes vale -> $result")
    result += 2
    println("result += 2 despues vale -> $result")

    println("----------  -=  -----------")
    println("result antes vale -> $result")
    result -= 2
    println("result -= 2 despues vale -> $result")

    println("----------   *=   -----------")
    println("result antes vale -> $result")
    result *= 2
    println("result *= 2 despues vale -> $result")

    println("---------   /=   ------------")
    println("result antes vale -> $result")
    result /= 2
    println("result /= 2 despues vale -> $result")

    println("--------   %=  -------------")
    println("result antes vale -> $result")
    result %= 2
    println("result %= 2 despues vale -> $result")

    x = 1
    println("------Incremento------")
    println("x++ -> ${x++}")
    println("++x -> ${++x}")

    println("------Decremento------")
    println("x-- -> ${x--}")
    println("--x -> ${--x}")




}