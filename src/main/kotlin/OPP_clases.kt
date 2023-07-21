fun main() {
    println("----------- POO EMPEZAMOS CON CLASES-------------")
    // las clases son una especie de plantilla para crear objetos con sus atributos
}

class Auto {
    // atributos
    var name = ""
    var model = ""
    var color = ""
    var puertas = 0

    // metodo constructor
    constructor(name: String, model: String, color: String, puertas: Int) {
        this.name = name
        this.model = model
        this.color = color
        this.puertas = puertas

    }

    fun mueve() {
        println("Funcion que mueve el auto")
    }

    fun detener() {
        println("Funcion que detiene el auto")
    }

}