package one.digitalinnovation.collections

fun main() {
    val vFixos = IntArray(3)

    vFixos[0] = 3
    vFixos[1] = 8
    vFixos[2] = 10
//    vFixos[3] = 9
    vFixos[2] = 9

    for (v in vFixos) {
        println(v)
    }

    val vVariaveis = intArrayOf(3, 6, 9)

    vVariaveis[2] = 8

    for (v in vVariaveis) {
        println(v)
    }
}
