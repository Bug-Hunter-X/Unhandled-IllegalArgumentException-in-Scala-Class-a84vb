```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge > 0) _age = newAge
    else throw new IllegalArgumentException("Age must be positive")
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  try {
    myObject.age = -1 // This will throw IllegalArgumentException
    println(myObject.age)
  } catch {
    case e: IllegalArgumentException => println(s"Error: "+e.getMessage)
    case e:Exception => println(s"An unexpected error occurred: "+e.getMessage)
  }
}
```