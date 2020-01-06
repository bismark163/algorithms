fun main() {
//    val fisrtString = "Kotltlin"
//    val secondString = "tlin"
//    val firstStringArray = fisrtString.toCharArray()
//    val secondStringArray = secondString.toCharArray()
//    println(firstStringArray[0])
//    нулвеой пэл первого массива сравниваем со нулевым эл второго
//    если он одинаковый - сравниваем следующий (прибавляем итератор)
//    до того когда итератор станет равным размеру второго массива
//
//    если нулевой не совпадает, тогда первый элемент сравниваем с нулевым до совдпаения

    var firstList: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
    val secondList: List<Int> = listOf<Int>(9, 2, 4, 6, 1, 0, -2, 3)
    val someList: List<Int> = listOf<Int>(9, 2, 4, 1, 6, 0, -2, 3)
    val thirdList: List<Int> = firstList + secondList
    val isInList = 3 in firstList
    val firstElementofList = firstList.first()
    val lastElementOfList = firstList.last()
    val indexOfElement = firstList.indexOf(1)
    val maxElementOfList = firstList.max()
    val minElementOfList = firstList.min()
    val sumList = firstList.sum()
    val sortedList = secondList.sorted()
    val sortedDescList = secondList.sortedDescending()


    val o = someList + 10
    println(someList)
    println(o)

//    var fFirst = firstList
//    println(fFirst.filter { it>5 })
//
//    println(fFirst)
//    println(firstList)


//
//    val lambda = { name: String ->
//        "I am lambda. You are $name"
//    }

//    println(lambda())

//    fun hello(name: String, lambda: (String) -> String) {
//        println(lambda(name))
//    }
//
//    hello("Kirill",lambda)
//
//
//    fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
//        val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
//        println(greetingFunction(playerName, numBuildings))
//    }
//
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }


//    println(greetingFunction("Guyal", 2))
//    runSimulation("Guyal", greetingFunction)


//    println(hahaha("miwewefe"))


//    println(firstList.filter { it < 0 })


//    fun invertPositives(list: MutableList<Int>) {
//        for (i in 0 until list.size) {
//            val element = list[i]
//            if (element > 0) {
//                list[i] = -element
//            }
//        }
//    }

//    invertPositives(firstList)
//    println(firstList)


//    println(sortedList)
//    println(sortedDescList)
//    println(someList == secondList)

}