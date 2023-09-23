package dev.panwar.kotlinbasics

fun main(){
//    String Interpolation/ String Templates
    val str="Hello World"
    var first=str[0]
    var last=str[str.length-1]
//    print("First character of str is "+first) this is what we write normally
//    print("First character of str is $first ") //this is String template(relatively more efficient)
    print("First character of str is $first and the length of str is ${str.length}") //{} because to read str.length together for $...other wise it will just read $str and output will be HelloWorld.length instead of 11




}