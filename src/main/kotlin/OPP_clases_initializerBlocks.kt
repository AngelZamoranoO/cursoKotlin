fun main() {
    println("--------- POO CLASES CON BLOQUES INICIALIZADORES -----------")

    val user = User("Angel","Zamorano",37)
    val friend = User("Camila","Diaz",30)

    println()
}

// para realizar cambios en el constructor primario se debe dejar la variable como parametro
class User(name:String, var lastName: String, var age: Int){
    var name: String

    // el bloque de init es para 
    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        }else{
            this.name = "User"
            println("El nombre no empieza con la letra 'a' o 'A'")
        }
    }
}
