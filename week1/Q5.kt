open class Human(val name:String){
    open fun attack() : String {
        return "$name use first Attack"
    }
}
class Mage(name:String) : Human(name){
    override fun attack() : String {
        return "$name use Fireball!"
    }
}
fun main(){
 val tmp = Mage("Child") 
 println(tmp.attack())
}
