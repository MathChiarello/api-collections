package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0 , 2250.0 , 4000.0 , 5000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------------------")

    println("Maior Salario: ${salarios.maxOf { it }}")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOf { it }}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    println("------------------------------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println(salarioMaiorQue2500)

    println("------------------------------------")

    println(salarios.count { it in 2000.0..5000.0 })

    println("------------------------------------")

    println(salarios.find { it == 2250.0 })
    if ((salarios.find { it == 250.0 }) == null){
        println("Nao encontrado!")
    }

    println("------------------------------------")

    println(salarios.any { it == 2250.0 })
    println(salarios.any { it == 250.0 })
}