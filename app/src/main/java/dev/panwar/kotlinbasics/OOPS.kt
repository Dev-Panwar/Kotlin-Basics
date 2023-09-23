package dev.panwar.kotlinbasics

fun main(){
   var dev=Person("Dev","Panwar",21)
    dev.stateHobby()
}

class Person(firstName: String="Dev", lastName:String="Panwar"){
    var age: Int?=null
    var hobby="Play VideoGames"
    var firstName: String?=null
    init {
        this.firstName=firstName
        println("Iniatialised a new person with "+"firstname: $firstName and lastName: $lastName ")

    }
//    Member Function
    fun stateHobby(){
        println("${firstName}\'s Hobby is $hobby")
    }

//    Member Secondary Constructor
    constructor(firstName: String,lastName: String, age: Int) :this(firstName,lastName){ //when calling secondary cons. primary constructor call is must
               this.age=age
    println("New Person is intialise with first name: $firstName and lastName $lastName and age: $age")

           }
}