fun main(){
    var Girl=Human("Judy",19,59)
    println( Girl.eat(3))
    Girl.speak("I am the best")
    Girl.Birthday()
    var person=user("Judy","Maina","wainainajudywanjiru@gmail.com",797239759,"madam")
    println(person.FirstName)
    println(person.password)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodwight:Int):Int{
        weight+=foodwight
        println("I am eating $foodwight kgs of food")
        return weight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun Birthday(){
        age++
        println(age)
    }
}
data class user(var FirstName:String,var lastName:String,var email:String,var phonenumber :Long,var password:String,) {
}