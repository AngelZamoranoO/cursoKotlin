import java.util.prefs.NodeChangeListener

fun main() {

    println("----------- funciones con parametros por defecto-------------")
    //esta clase veremos las funciones que tenemos que pasar con parametros por defecto
    // activa a funcion por defecto
    sendMessage()

    //Se envia argumentos a la funcion
    sendMessage("Angel","que sucede mi compa?")
    sendMessage(message = "Hola como estas?")
    sendMessage(name = "Camila")
    sendMessage(senSomeText = "Algo mas necesitas")
}
// en este ejemplo tenemos la funcion con parametros, y al assignar el parametro un valor, ese mensaje
// esa variable esta predeterminado o por default
fun sendMessage(name: String = "User", message: String = "Message", senSomeText: String = senText()) {
    println("Name = $name and message = $message and senSomeText = $senSomeText")
}
// tambien se puede pasar parametros con funciones para que tengan valores por defectos
fun senText():String{
    return "Algo de texto"
}