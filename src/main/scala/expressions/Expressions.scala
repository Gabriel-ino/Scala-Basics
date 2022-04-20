package expressions

object Expressions extends App {

  def start(): Unit = {
  val x = 1 + 2
  println(x)

  // While loop

  var index = 0
  while (index < 10){
    println(index)
    index += 1
  }

  // PLEASE DON'T DO THAT!

  // EVERYTHING IN SCALA IS AN EXPRESSION


  // Side effects: println(), whiles, reassigning

  // Code blocks 

  val codeBlock = {
    val i = 2
    val z = i + 1 

    if (z > 2) "Hello" else "World"
  }

  }

}
