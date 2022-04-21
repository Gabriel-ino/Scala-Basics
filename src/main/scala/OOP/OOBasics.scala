package OOP

object OOBasics extends App{
  val person = new Person("Gabriel", 20)
  person.greet("Daniel")

  val writer = new Writer("Gabriel", "Chaves", "11/09/2002")
  val novel = new Novel("An awesome name", "20/05/2022", writer)

  println(novel.authorAge)
  println(novel.isWrittenBy())
}

// Constructor
class Person(name: String, age: Int){
    //Body 
    val x = 2
    println(name + " initialized!")

    //method
    def greet(name: String): Unit = {
        println(s"${this.name} says: 'Hi, $name'")
    }

    //overloading
    def greet(): Unit = println(s"Hello $name")


}// class parameters are NOT fields


class Writer(name:String, surname:String, birth:String) {

    def getFullName(): String = s"${this.name} ${this.surname}"

    def getSplicedBirth(): List[String] = this.birth.split("/").toList

}

class Novel(name:String, released_day:String, writer: Writer){

    var writerCompletedYear: Boolean = false

    def getSplicedRelease(): List[String] = this.released_day.split("/").toList

    def authorAge(): Int = {
        val data_birth = this.writer.getSplicedBirth()
        val data_release = this.getSplicedRelease()
        this.writerCompletedYear = false

        if (data_release(1) > data_birth(1) || (data_release(1) == data_birth(1) && data_release(0) > data_birth(0))) {
            this.writerCompletedYear = true
            
        }
        var ageWriter = data_release(2).toInt - data_birth(2).toInt
        if (!this.writerCompletedYear){
            ageWriter = ageWriter - 1
        }
        ageWriter

    }
    def isWrittenBy(): String = writer.getFullName()
}


