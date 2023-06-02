//funciones que regresan valores y que no regresan valores
fun main(){

    val numero1 = 12;
    val numero2 = 15;

    borde("*", 20);
    borde("*", 35);
    var resultado = suma(numero1, numero2);
    println(resultado);

    // val slogan = {numero: Int -> println("tu puedes con $resultado problemas")}
    // slogan(resultado);

    val resta = {num1: Int, num2: Int -> num1 - num2}
    println("Resta: ${resta(2,1)}")
    
    val max = {num1: Int, num2: Int, num3:Int -> maxOf(num1, num2, num3)}       
    println("Valor maximo: ${max(2,4,6)}")

    val promedio = {num1: Int, num2: Int, num3:Int -> (num1 + num2 + num3)/3}       
    println("Valor promedio: ${promedio(2,4,6)}")

}

fun borde(caracter: String, veces: Int){
    for( i in 1..veces){
        print(caracter);
    }
    println();
}

fun suma(n1: Int, n2: Int): Int {
    return n1 + n2;
}