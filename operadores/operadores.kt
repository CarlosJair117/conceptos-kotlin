fun main() {

    val a = 10;
    val b = 15;
    var c = 12; //mutable, el valor va a cambiar

    println("operadores:");

    //c = a + b;
    c = a.plus(b)
    println("$c = $a + $b");
    
    c = a.minus(b)
    println("$c = $a - $b");

    //comparaciones
    print("$a > $b = ");
    println(a.compareTo(b)>c);

    print("$a < $b = ");
    println(a.compareTo(b)<c);
    
    print("$a == $b = ");
    println(a.equals(b));
    
    print("$a != $b = ");
    println(!(a.equals(b)));
}