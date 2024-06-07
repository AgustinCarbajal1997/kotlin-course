//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var v1 : String = "Hola"

    println(v1)

    v1 = "Chau"

    println(v1)

    val constante : String = "Esto es una constante"

    var x : String? = null

    x?.let {
        println("x tiene valor")
    } // permite saber si es null o no. Si es null no va a ingresar

    println("valor null safety")

    x = "valor null safety inicializado"

    println(x)


    //cambio de tipo de datos

    val num1 = 5
    val num2 = "10"
    var res = num1 + num2.toInt()
    println(res)
    println("Soy el numero: $num1")

    // try catch
//    try {
//        println("Escribe el primer valor")
//        val n1 = readln().toInt()
//        println("Escribe el segundo valor")
//        val n2 = readln().toInt()
//        val res = n1 + n2
//        println(res)
//    } catch ( e: NumberFormatException) {
//        println("Error: escribe un numero valido")
//    }

    var array = arrayOf("agustin", "claudio", "miguel")
    println(array.contentToString())
    println(array[1])
    array[1] = "mario lopez"
    println(array.contentToString())
    println(array.size)
    array += "gisela"
    println(array.contentToString())
}

/*
    String
    Int
    Double
    Float
    Boolean
    las constantes se declaran con val

    null safety
    var x : String?  // puede ser que tenga o que no tenga un valor

    cambio de tipo de datos

    arrays

 */