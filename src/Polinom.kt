fun main() {

    fun checkPolinom(word: String): Boolean {


        val list = word.toCharArray()
        var listSize = list.size - 1
        val halfListSize = (list.size / 2) - 1
        var i = 0
        while (i <= halfListSize) {

            if (list[i] == list[listSize]) {
                i++
                listSize--
            } else {
                return false
            }

        }

        return true
    }

    println(checkPolinom("argentumutnegra"))
}

