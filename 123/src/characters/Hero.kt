package characters
import world.Quest
import magic.Spell
class Hero(var name: String, var gender: String, var role: String, var hp: Int, var mp: Int, var element: String, var level: Int) {

    fun status() {
        println("name - $name, class - $role, hp - $hp, mp $mp")
    }

    fun IsAlive(): Boolean {
        return hp > 0
    }

    fun CanAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "легкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept) {
            println("$name может принять квест ${quest.title}")
        } else {
            println("Необходим более высокий уровень")
        }


    return canAccept}
    fun canCast(spell: Spell): Boolean {
        return spell.name.length <= level * 2 && spell.width <= 5 && spell.height <= 5
    }

}