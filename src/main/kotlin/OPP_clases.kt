import java.awt.Color

fun main() {
    println("----------- POO EMPEZAMOS CON CLASES-------------")
    // las clases son una especie de plantilla para crear objetos con sus atributos
    // Se instancia el objeto o se crea con car1 y se agina los atributos de la clase
    var car1 = Auto()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "red"
    car1.puertas = 4

    println("Nombre -> ${car1.name}")
    println("Modelo -> ${car1.model}")
    println("Color -> ${car1.color}")
    println("Puertas -> ${car1.puertas}")

    car1.mueve()
    car1.detener()
    // se instancia el objeto (se crea el objeto) para que tenga las propiedades de la clase o plantilla
    var car2 = Auto()
    car2.name = "Toyota"
    car2.model = "Corolla"
    car2.color = "Negro"
    car2.puertas = 4
    print("\n")
    println("Nombre -> ${car2.name}")
    println("Modelo -> ${car2.model}")
    println("Color -> ${car2.color}")
    println("Puertas -> ${car2.puertas}")

    car2.mueve()
    car2.detener()
    println("\n ")

}

// se crea la clase o plantilla
class Auto {
    // atributos
    var name = ""
    var model = ""
    var color = ""
    var puertas = 0

    fun mueve() {
        println("Funcion el auto $name se esta moviendo")
    }

    fun detener() {
        println("Funcion el auto $name se detiene")
    }

}