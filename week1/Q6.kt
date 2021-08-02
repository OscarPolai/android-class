/*  Q6 is about writing checkmana() function to check if the Human/Mage class has 
    mana or not.
    Defaulted set the Human class doesn't has mana, the Mage class has.
    In Mage class, we inherited checkmana() function from Human.
 */


open class Human(val name:String){
    open val mana : Boolean = false
    open fun attack() : String {
        return "$name use first Attack"
    }
    open fun checkmana() : String {
    	return "If $name has mana or not? : $mana "
    }
    
}
class Mage(name:String) : Human(name){
	override val mana = true
    override fun attack() : String {
        return "$name use Fireball!"
    }
}
fun main(){
     val tmp = Human("Oscar") 
     val tmp2 = Mage("Vincent")
     println(tmp.mana)
     println(tmp.checkmana())
     println(tmp2.mana)
     println(tmp2.checkmana())
}
