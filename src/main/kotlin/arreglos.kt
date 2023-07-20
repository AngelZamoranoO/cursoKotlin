fun main() {
    println("---------------- CLASE DE ARREGLOS O VECTOR -------------")

    // El vector se puede definir de manera explicita y implicita (que lo detecta solo)
    val names:Array<String> = arrayOf("Angel","Camila","Felipe")
    val namesDos = arrayOf("Pepe","Feña","donAngel")
    val multidata = arrayOf(4,5,6,7,4,"Name 1",'a')


    println("Primer elemento -> ${names[0]}")

    names[0]="Juana de Arco"

    println("Cambio valor del primer elemento -> ${names[0]}")

    try {
        println("------- error en vector fuera de rango el indice ----------")
        println(names[4])
    }catch (e:Exception){
        println("Error -> $e")
    }

    println("El tamaño de elemento(objetos) en arreglo -> ${names.size}")

    println("-------- recorrido del arreglo para imprimir cada elemento --------")
    for (i in multidata){
        println("$i, ")
    }

    println(" imprime cada elemento segun el tipo")

    for (x in multidata){
        if (x is Int) {
            // imprime todos los elementos de un array que son tipo Entero
            print("solo Int -> ")
            println(", $x")
        }
        if (x is Char){
            //imprime todo lo de tipo Char
            print("solo Char -> ")
            println(x)
        }
        if (x is String){
            // imprime solo valores tipo String
            print("solo String -> ")
            println(x)
        }
    }




}