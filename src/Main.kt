//fun main() {
//
//   // val numbers = Array<Int>(2, 4, 1, 4, 5)
//
//    val n = 3
//
//    первая часть
//            сначала мы проходим по указанному массиву и заполняем наш пустой массив
//
//
//    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
//    var a: Int
//    var b: Int
//    if (numbers[0] > numbers[1]) {
//        a = numbers[0]
//        b = numbers[1]
//    } else {
//        b = numbers[0]
//        a = numbers[1]
//    }
//
//    var d = 0
//    var maxIndex = 0
//    var n = 5
//    var s = 0
//    var numbers2 = emptyArray<Int>()
//    var size = numbers.size - 1
//
//
//    for (i in numbers) {
//        if (i > a) {
//            b = a
//            a = i
//        } else if (i > b) {
//            b = i
//        }
//    }
//
//    println(a)
//    println(b)
//
////     Второй вариант решения
//    while (d <= size - 1) {
//        if (a < numbers[d]) {
//            a = numbers[d]
//            println("Я внутри условия для а, d = $d")
//            (10000)
//        } else if (b < numbers[d]) {
//            b = numbers[d]
//            println("Я внутри условия для b, d = $d")
//
//        }
//        d++
//        println("Я в общем теле цикла, d = $d")
//
//    }
//
//    while (s <= n - 1) {
//        while (d <= size) {
//            if (a < numbers[d]) {
//                a = numbers[d]
//                maxIndex = d
//            }
//            d++
//
//        }
//        numbers2 += a
//        numbers.removeAt(maxIndex)
//        size -= 1
//        d = 0
//        a = 0
//        s++
//    }
//
//    for (i in numbers2) {
//        println(i)
//    }
////
////
//}