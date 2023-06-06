fun main() {
    var diccionario = mutableMapOf(
        "pollo" to "chiken",
        "azul" to "blue"
    );

    println(diccionario);

    println("Escribe la nueva palabra");
    val palabra = readLine();

    println("Escribe la traduccion de la palabra");
    val traduccion = readLine();

    agregar(diccionario, "$palabra", "$traduccion")
    println(diccionario);

    println("Consulte una palabra para traducir: ")
    val consulta = readLine();

    if (consulta in diccionario){
        println(diccionario[consulta])
    } else {
        println("La palabra $consulta: ${diccionario.getOrDefault(consulta, "traduccion desconocida")}")
    }

    println(diccionario);
}

fun agregar( objeto: MutableMap<String, String>, palabra: String, traduccion: String){
    objeto.put("$palabra", "$traduccion");
}