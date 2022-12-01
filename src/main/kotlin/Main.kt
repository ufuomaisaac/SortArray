
fun sortArray(element : IntArray) : IntArray {
    for (i in 0 until element.size - 1) {
        var minIndex = i

        for(j in i + 1 until element.size) {
            if(element[j] < element[minIndex])
                minIndex = j
        }
        var temp = element[minIndex]
        element[minIndex] = element[i]
        element[i]  = temp
    }
    return element
}

fun main(args : Array<String>) {
    var elements = intArrayOf(5,3,8,1,9,4)
    print("Given Array:  ")
    printArray(elements)
    println()

    var sortedArray = sortArray(elements)
    print("Sorted Array:  ")
    printArray(sortedArray)
}

fun printArray(arr : IntArray) {
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
}
