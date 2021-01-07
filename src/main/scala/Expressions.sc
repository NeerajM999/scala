//1. Variables
//Everything in scala is an expression unlike other languages where it's called statements
//An expression in scala will always return a value
//which is not the case in other languages

val a = 10

val b = 20

val c = if(a > 15){
    5
}else{
  10
}

// above ex. shows that even an if condition
// is an expression in scala and it returns a value

//val: data types provide immutability while,
//var: types are mutable in scala

//c = 20

var d = 10
d = 20

//2. String Embedding
// you can embed variables inside a string by appending your string with 's'

s"This is $a and this is $b"
s"this is $c"

// run a block of scala code
s"This is a-b = ${a-b}"

//extract and print each letter of a string
"Hello".foreach(a => println(a))

//3. Numbers

Int.MaxValue
Double.MaxValue

5.5.toInt