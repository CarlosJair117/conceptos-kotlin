fun main() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento de la posicion 3: ${readOnly.get(2)}");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Ultimo elemento de la lista: ${readOnly.last()}");

    for(elemento in readOnly){
        println(elemento);
    }

    println("Elementos de la lista con forEach:")
    readOnly.forEach{
        println(it)
    }

    val mutable: MutableList<String> = mutableListOf("Lunes", "Martes");
    println("Lista Mutable: $mutable");
    mutable.add("Miercoles");
    println("Lista Mutable: $mutable");

    val emptyList: MutableList<String> = mutableListOf();
    println("La lista esta vacia: ${emptyList.none()}")
    println("Primer elemneto de lista vacia: ${emptyList.firstOrNull()}")
    println("Ultimo elemneto de lista vacia: ${emptyList.lastOrNull()}")

    readOnly.forEach{
        emptyList.add(it);
    }
    println("Lista que estaba vacia: $emptyList")

    val numeros = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Numeros de loteria: $numeros")
    val numerosOrdenados = numeros.sorted();
    println("Numeros de ordenados: $numerosOrdenados")
    val numerosDescendentes = numeros.sortedDescending();
    println("Numeros descendentes: $numerosDescendentes")
    val numerosPares = numeros.filter{num -> num % 2 == 0}
    println("Numeros pares: $numerosPares")
}