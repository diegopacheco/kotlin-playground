fun add(a:Int): (Int) -> Int {
    return fun(b:Int): Int {
        return a + b;
    }
}

val add2 = add(2);
val add5 = add(5);
val add7 = add(7);

fun filter(predicate:(Int)->Boolean): (List<Int>) -> List<Int>{
    return fun(list:List<Int>): List<Int>{
        return list.filter(predicate);
    }
}

val isEven = {n:Int -> n%2==0}
val isOdd = {n:Int -> n%2!=0}

val filterEven = filter(isEven)
val filterOdd = filter(isOdd)

fun main(){

    println("added 2 on 3 == ${add2(2)}")
    println("added 5 on 3 == ${add5(3)}")
    println("added 7 on 3 == ${add7(3)}")

    val numbers = listOf(1,2,3,4,5,6,7,8,9,10);
    println("evens = ${filterEven(numbers)}")
    println("odds = ${filterOdd(numbers)}")

}