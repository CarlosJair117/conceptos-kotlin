fun main() {

    println("Valores de i: ")
    for (i in 1..10){
        print("$i, ")
    }

    println();
    println("Letras: ")
    for (caracter in 'a'..'g'){
        print("$caracter, ")
    }

    println();
    println("Letras: ")
    for (caracter in 'a'..'g' step 2){
        print("$caracter, ")
    }

    println();
    println("Letras: ")
    for (caracter in 'g' downTo 'a'){
        print("$caracter, ")
    }

    val mascotas = arrayOf("Lassy", "Blackie", "Moji", "Moka")
    println();
    println("Mascotas: ");
    for( i in mascotas.indices){
        println("[$i, ${mascotas[i]}]")
    }

    println();
    println("Dividiendo una cadena de caracteres: ");
    for( letra in "Hola mundo Kotlin"){
        print("$letra ,")
    }

}