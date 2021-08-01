class Human(val name:String){
    fun attack() : String {
        return "$name use first Attack"
    }
}
fun main(){
    val temp = Human("Oscar")
    println(temp.attack())
}

