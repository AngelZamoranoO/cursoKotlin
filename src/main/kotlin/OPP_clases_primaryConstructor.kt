fun main() {
    println("--------- POO CLASES CON CONSTRUCTOR PRIMARIO -----------")
    /*
    Se instancia o se crea un objeto con la clase con constructor
     */
    var auto1 = AutoDos("Ford      ","Ford","Blue",4)

    print("\n")
    println("Nombre -> ${auto1.name}")
    println("Modelo -> ${auto1.model}")
    println("Color -> ${auto1.color}")
    println("Puertas -> ${auto1.puertas}")

    auto1.mueve()
    auto1.detener()

}

// se puede crear parametros de la siguiente forma para una clase y se pueden asignar
// los atributos en el mismo constructor
class AutoDos( name: String, var model: String, var color: String, var puertas: Int) {
    // se asigna atributo para que pueda trabajar los metodos
    var name = name.trim()
    //atributo que se asigna parametro
    fun mueve() {
        println("Funcion el auto $name se esta moviendo")
    }

    fun detener() {
        println("Funcion el auto $name se detiene")
    }

}