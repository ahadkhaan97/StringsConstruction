fun main() {
    print(solution("zzz", "zzzzzzzzzzz"))
}

fun solution(a: String, b: String): Int {
    if (b.length < a.length)
        return 0

    val aMap = HashMap<Char, Int>()
    val bMap = HashMap<Char, Int>()

    for (i in a) {
        aMap[i] = (aMap[i] ?: 0) + 1
    }
    for (i in b) {
        bMap[i] = (bMap[i] ?: 0) + 1
    }

    var min = Integer.MAX_VALUE

    aMap.forEach {
        val division = (bMap[it.key] ?: 0) / it.value
        if (division < min)
            min = division
    }

    return min
}
