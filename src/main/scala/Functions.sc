//functions return the last statement as the return value

def add(first: Int, second:Int):Int={
  first + second
}

add(3, 4)

def add(first: Int, second:Int, third: Int):Int = {
  println("Hello")
  first + second + third
}

add(3, 4,5 )

//unknown nos of arguments
def addMany(nums: Int*):Int={
  nums.reduce(_ + _)
}

addMany(1,2,3,4)

// using match statements
def describeNumberOfBits(num: Int):String={
  num match {
      case bit if bit < 4 => "bit"
      case nibble if nibble < 8 => "nibble"
      case byte if byte < 1023 => "byte"
      case manyByte => "manyByte"
  }
}

describeNumberOfBits(4)
describeNumberOfBits(9)
describeNumberOfBits(2000)

// Options - use it when you know there could be a value or none
// Some - means there's some value
// None - means no value

val a:Option[String] = None
val b:Option[String] = Some("john")

val c:Option[String] = a orElse b

val e:Option[String] = None
val d:Option[String] = Some("john")


val f:Option[String] = d orElse e

val g:Option[String] = None
val h:Option[String] = None

val i:String = g orElse h getOrElse "Tee"
