fun main() {

    val count = 7
    var numbers: MutableList<Int> = mutableListOf(2, 2727, 6234)
    val size = numbers.size
    var finalList = mutableListOf<Int>()
    var num = 0
    var nextNum = 0
    var d = 0
    var previousNum: Int
    var index = 0


    while (d < size) {

        // Здесь наш массив уже имеет размер count
        if (finalList.size == count) {

            // Число numbers[d] сравнивается с каждым числом имеющегося массива
            // На выходе получаем индекс числа, которое нужно поменять и его значение
            while (index < count) {
                if (finalList[index] < numbers[d]) {
                    index += 1
                } else {
                    break
                }
            }

            //Затем смотрим, попадает ли индекс в наш создаваемый массив
            index -= 1
            if (index in 0..count - 1) {

                //Если попадает, то смотрим его значение. Если оно нулевое, то просто первое число заменяем на новое???
                if (index == 0) {
                    finalList[index] = numbers[d]
                } else {

                    num = finalList[index]
                    finalList[index] = numbers[d]
                    while (index > 0) {
                        previousNum = finalList[index - 1]
                        finalList[index - 1] = num
                        num = previousNum
                        index -= 1
                    }

                }



            }
            index = 0
          //  num = 0 - чёт не доходит, почему их не нужно сбрасывать, а индекс нужно?
          //  previousNum = 0

        }

        if (finalList.size < count) {

            // Смотрим, что список не пуст и входим в условие
            if (finalList.size > 0) {

                // Первая проверка на то, что новое добавляемое число больше последнего в списке. Если это так, просто добавляем его
                if (numbers[d] > finalList[d - 1]) {
                    finalList.add(numbers[d])
                }

                // Вторая проверка, если добавляемое число меньше нулевого числа в списке. Тогда весь список смещаем
                else if (finalList[0] > numbers[d]) {
                    num = numbers[d]
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
                        if (finalList[index] < numbers[d]) {
                            index += 1
                        } else {
                            break
                        }
                    }


                    // Вставляем число и смещаем уже имеющиеся
                    num = numbers[d]
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
                finalList.add(numbers[d])
            }

           println("Это список перед тем как он уйдёт в другое условие $finalList")
        }

        d++

    }

    println(finalList)

}


