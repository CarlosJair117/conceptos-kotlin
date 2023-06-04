fun main() {
    val telefonos: Map<Int, String> = mapOf(
        14 to "USA",
        34 to "ESP",
        52 to "MEX",
        23 to "ARG"
    );

    println(telefonos);

    for( (key, value) in telefonos){
        println("la clave de $value es $key")
    }

    telefonos.forEach{(k, v) -> println("$k => $v")}

    println(telefonos.get(52));
    println(telefonos[52]);

    println("Tamaño: ${telefonos.size}")
    println("Claves del mapa: ${telefonos.keys}")
    println("Valores del mapa: ${telefonos.values}")
    println("Entradas del mapa: ${telefonos.entries}")
    println("Valor del telefono 48: ${telefonos.getOrDefault(48, "Pais desconocido")}")
    println("Valor del telefono 14: ${telefonos.getOrDefault(14, "Pais desconocido")}")
    println("Existe la clave lada 86: ${86 in telefonos}")
    println("Existe el valor Mexico en el mapa: ${"Mexico" in telefonos.values}")

    //mapa mutable
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4
    );

    println("Mapa de numeros: $nums")

    nums.remove("two")
    println("Mapa de numeros: $nums")
    
    nums["six"] = 6;
    println("Mapa de numeros: $nums")
    
    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums")

    //ingresar valores desde teclado
}