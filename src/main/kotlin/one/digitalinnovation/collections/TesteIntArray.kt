/*
 TRABALHANDO COM ARRAY

Array e List - Há diferença no Kotlin

Propriedades:
> Tamanho Fixo
> Imutáveis

IntArray() --> Informar tamanho


*/















package one.digitalinnovation.collections

fun main() {
    val values = IntArray(6)

    // val values2 = IntArray(1,7,6,3,2,9)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    values[5] = 9

    println("----------------- For Basico -----------------")

    for (valor in values) {
        println(valor)
    }

    println("----------------- For Each -----------------")

    values.forEach {
        println(it)
    }

    println("----------------- For olhando para os indices -----------------")

    for (index in values.indices) {
        println(values[index])
    }

    println("----------------- For ordenando os resultados -----------------")

    values.sort()
    for (valor in values) {
        println(valor)
    }

    println("----------------- For Basico -----------------")

    for (valor in values) {
        println(valor + 2)
    }
}