fun main() {
    var nombre: String? = null;
    println("El valor nulo de nombre");
    println(nombre);
    //nombre = "Ginger";
    //println(nombre!!.length);

    // var longitud = nombre?.length ?: 0;
    // println("Longitud de nombre: $longitud");

    try{
        println("nombre: $nombre");
    } catch( exception: NullPointerException) {
        println("Ha ocurrido un error");
        println(exception);
    } finally {
        println("Lo que esta en el finally siempre se ejecuta")
    }

    var longitud = -1;

    try{
        longitud = nombre?.length;
    } catch( error: NullPointerException) {
        longitud = 0;
    } finally {
        println("Valor de longitud: $longitud")
    }

}