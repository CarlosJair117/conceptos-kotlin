fun main() {
    //Un val es ua valor inmutable
    // var si es una valor inmutable
    val veces = 35;
    val border = "*";

    printBorder(1, 30);
    println("Hola mundo Kotlin");
    printBorder(5, 20);
    println();
    println("En este programa, el caracter de borde es: ${border}");
    println("y se imprime ${veces} veces");
}

// fun printBorder(numero: Int, caracter: String){
//     repeat(numero){
//         print(caracter);
//     }
//     println();
// }

fun printBorder(numeroCaracter: Int, numero: Int){
    when( numeroCaracter ) {
        1 -> 
        repeat(numero) {
            print('*')
        }
        2 -> 
        repeat(numero) {
            print('_')
        }
        3 -> 
        repeat(numero) {
            print('@')
        }
        else ->
            print("no se ejecuta")
    }
    println();

}