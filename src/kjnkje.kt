fun main() {
    val count = 5
    var numbers: MutableList<Int> = mutableListOf(2, 6, 4, 7, 1)
    val size = numbers.size
    var finalList = mutableListOf<Int>()
    var s = 0
    var num = 0
    var nextNum = 0
    var index = 0
    while (s < count) {

        // Смотрим, что список не пуст и входим в условие
        if (finalList.size > 0) {

            // Первая проверка на то, что новое добавляемое число больше последнего в списке. Если это так, просто добавляем его
            if (numbers[s] > finalList[s - 1]) {
                finalList.add(numbers[s])
            }

            // Вторая проверка, если добавляемое число меньше нулевого числа в списке. Тогда весь список смещаем
            else if (finalList[0] > numbers[s]) {
                num = numbers[s]
                while (index < finalList.size) {
                    nextNum = finalList[index]
                    finalList[index] = num
                    num = nextNum
                    index++

                }
                index = 0
                finalList.add(nextNum)
            }

            // Если первые два условия не попались, попадаем в третий вариант
            else {

                // Ищем индекс, куда нужно вставить добавляемое число
                while (index < finalList.size) {
                    if (finalList[index] < numbers[s]) {
                        index += 1
                    } else {
                        break
                    }
                }


                // Вставляем число и смещаем уже имеющиеся
                num = numbers[s]
                while (index < finalList.size) {
                    nextNum = finalList[index]
                    finalList[index] = num
                    num = nextNum
                    index++

                }
                finalList.add( nextNum)
                index = 0
            }


        }

        //Проверка, что финальный список пустой. Если это так, от первое число добавляем в список
        if (finalList.size == 0) {
            finalList.add(numbers[s])
        }
        s++

    }
    println(finalList)
}

// сравниваем каждый элемент финального списка с имеющимся значением
// находим нужный элемент
// если индекс так и не найден, то ставим в конец. если индекс найден - ставим со смещением

