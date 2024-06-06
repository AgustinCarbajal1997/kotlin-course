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

 */