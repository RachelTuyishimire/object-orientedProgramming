fun main() {
   var person = Human ("Max", 13, 56.9)
    person.eat(3)
    println(person.weight)
    person.speak("Adalab is the best class")
    person.birthday()


    var credentials= User("Jack", "Nkunda", "jacknkunda@gmail.com","0780578020","nkunda1234")
    println(credentials.firstName)
    println(credentials.lastName)
    println(credentials.password)



}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
 class Human(var name:String, var age:Byte, var weight:Double) {


fun eat(foodweight:Int) {
    println("Iam eating $foodweight kgs of food")
    weight += foodweight
}
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
        age ++
        println(age)
    }


}
//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){

}