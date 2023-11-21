fun five(): Int {
    return 5
}

fun two(): Int {
    return 2
}

fun multiplyBy(myInput: Int, multiplierFun: () -> Int): Int {
    return myInput * multiplierFun()
}

typealias mulFun = () -> Int
fun anotherMultiplyBy(myInput: Int, multiplierFun: mulFun): Int {
    return myInput * multiplierFun()
}

