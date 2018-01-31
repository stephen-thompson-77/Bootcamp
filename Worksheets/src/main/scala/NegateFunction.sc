import scala.annotation.tailrec
//def f(fv: (Int, Int) => Boolean): (Int, Int) => Boolean = !fv(_,_)
//
//
//val testFn = (a: Int, b: Int) => a > b
//val test = testFn(4, 10)
//val lastTest = f(testFn)(4, 10)


var fibGen = {
  var prev, current, temp, i = 0
  () => {
    if (i == 1) current += 1
    else temp = current
      current += prev
      prev = temp
    i += 1
    current
  }
}

val fib1 = fibGen

fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()
fib1()

val fib2 = fibGen
fib2()
fib2()
fib2()
fib2()
fib2()
fib2()
fib2()
fib2()
fib2()


def factorialFunc(n: Int): BigInt = {
  if(n == 0) 1 else n * factorialFunc(n - 1)
}

val factFunc = factorialFunc(5)

@tailrec
def factorialTailFunc(n: Int, a: BigInt = 1): BigInt = {
  if(n == 0) 1 else n * factorialTailFunc(n - 1, n * a)
}

val factTailFunc = factorialTailFunc(5)

def factorial(n: Int): BigInt = {
  @tailrec
  def factorialTailFunc(n: Int, a: BigInt): BigInt = {
    if(n == 0) 1 else n * factorialTailFunc(n - 1, n * a)
  }
  factorialTailFunc(n, 1)
}

val wrappedTailFact = factorial(5)

//def isPalindrome(String: word): Boolean ={
//  //iterate over character
//  var result = false
//  var iFirst = 0
//  var iLast = String. word
//  // while indexBeginning >= indexLast return result
//  while(){
//
//  }
//  //if first and last character the same increment first, decrement last
//
//}
//
//val yes1 = isPalindrome("lol")
////val no1 = isPalindrome("abc")
//
//val list = new Array[Int]()
//list.apply(2)
//list.apply(4)
//list.apply(5)
//list.apply(10)

//def sum(List: list, Int num, Int index): Int = {
//  if()
//}
//
//def processAll(List: list): Int = List match {
//  case Nil => 0
//  case h :: tail => {
//    h += h
//    processAll(tail)
//}

