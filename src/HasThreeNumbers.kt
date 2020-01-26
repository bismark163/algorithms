fun main() {


//    val numbers = listOf(0, 0, 25, 94, 20, 89, 80, 3, 51, 6, 18, 12, 42, 63, 48, 59, 28, 85, 82, -66, 0)
    val numbers = listOf(-1, -2, 4)
    val targetNumber = 1
    var i = 0
    var hasThreeRequiredNubmers = false
    val mapWithNumbersCount = mutableMapOf<Int, Int?>()

    for (number in numbers) {
        if (number !in mapWithNumbersCount) {
            mapWithNumbersCount.put(number, null)
        } else {
            mapWithNumbersCount[number] = (mapWithNumbersCount.getValue(number) ?: 1) + 1
        }
    }

    if (numbers.size <= 2) {
        hasThreeRequiredNubmers = false
    } else {

        while (i in 0 until numbers.size) {
            var firstAddendum = numbers[i]

            var secondIterator = i + 1

            while (secondIterator in (i + 1) until numbers.size) {
                var secondAddendum = numbers[secondIterator]
                val residual = targetNumber - (firstAddendum + secondAddendum)


                if (residual !in mapWithNumbersCount) {
                    secondIterator++
                } else if (firstAddendum == residual && secondAddendum != residual && (mapWithNumbersCount.getValue(
                        residual
                    ) ?: 0) > 1
                ) {
                    hasThreeRequiredNubmers = true
                    break
                } else if (firstAddendum != residual && secondAddendum == residual && (mapWithNumbersCount.getValue(
                        residual
                    ) ?: 0) > 1
                ) {
                    hasThreeRequiredNubmers = true
                    break
                } else if (firstAddendum == residual && secondAddendum == residual && (mapWithNumbersCount.getValue(
                        residual
                    ) ?: 0) > 2
                ) {
                    hasThreeRequiredNubmers = true
                    break
                } else if (firstAddendum != residual && secondAddendum != residual && (mapWithNumbersCount.getValue(
                        residual
                    ) ?: 0) >= 0
                ) {
                    hasThreeRequiredNubmers = true
                    break
                }
                secondIterator++
            }

            i++
        }
    }
    println(hasThreeRequiredNubmers)
}


//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
//    println(filteredMap)




