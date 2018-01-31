List(1, 2, 3, 4, 5)

val maybeSubjects = List(Some("Maths"), None, Some("Latin"), None)

val concreteSubjects = maybeSubjects flatten

//def repeatUntil(end: Int) = {
//  0.to(end).foreach(println(_))
//}
//
//def repeat(end: Int) = {
//  var count = 0
//  if(count <= end){
//
//  }
//}

def until(count: Int, end: Int)(f: => Unit): Unit = {
    if(count < end){
      f
      count += 1
      repeat(f)
    }
}

val looper = until(5) {
    println("Loop")
}

def repeat(f: => Unit) = {
  f
}