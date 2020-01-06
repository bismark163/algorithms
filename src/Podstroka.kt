fun main() {
    fun checkPodstroka(string: String, podstring: String): Boolean {

        val array = string.toCharArray()
        val podArray = podstring.toCharArray()
        val podArraySize = podArray.size
        val iteratorsEnd = (array.size - podArray.size)
        var i = 0
        var sovpadChisla = 0

        while (i <= iteratorsEnd) {

            var internalIterator = i

            loop@ for (a in 0 until podArray.size) {

                if (podArray[a] != array[internalIterator]) {
                    break@loop
                } else {
                    internalIterator++
                    sovpadChisla++
                }
            }

            if (sovpadChisla == podArraySize) {
                return true
            }

            sovpadChisla = 0
            i++

            if (i > iteratorsEnd) {
                return false
            }
        }

        return true

    }

    println(checkPodstroka("Ya em sobak", "b"))
    println(checkPodstroka("Ya em sobak", "Ya"))
    println(checkPodstroka("Ya em sobak", "em"))
    println(checkPodstroka("Ya em sobak", "sob"))
    println(checkPodstroka("Ya em sobak", "Ya em sobak"))
    println(checkPodstroka("a", "a"))
    println(checkPodstroka("Ya em sobak", "i"))
    println(checkPodstroka("Ya em sobak", "aegewgwe"))


}