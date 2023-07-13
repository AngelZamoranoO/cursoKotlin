fun main() {
    println("-----------ciclos or loops for --------")
    // el i es indice y despues de in se ingresa un rango que es 1..7
    for (i in 1..7){
        println("i = $i")
    }
    println("-------------------------------")
    for (a in 1 until 10){
        println("a = $a")
    }
    println("-------------------------------")
    for (b in 10 downTo  2){
        println("a = $b")
    }
    println("-------------------------------")
    for(c in 1 until 13 step 2){
        println("c = $c")
    }
    println("-------------------------------")
    
}