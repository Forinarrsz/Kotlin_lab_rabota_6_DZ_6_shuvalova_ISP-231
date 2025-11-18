package characters

class Enemy(var name: String, var hp: Int, var element: String, val aggressionLevel: Int = 2, val health: Int) {
    /* fun takeDamage(amount: Int){
        println("$name получает $amount урона" )
        hp -= amount
        if (hp < 0) hp = 10
        println("Осталось hp $hp")}*/

    fun IsSrong(): Boolean {
        return hp > 100
    }
    fun getThreatLevel(): String {
        if (hp <0){return "Здоровье не может быть отрицательным"}
        return when {
            hp <= 50 -> "низкий"
            hp >= 150 -> "средний"
            else -> "высокий"
        }
    }
    fun calculatePower(): Int {
        return health * aggressionLevel
        //Немного непонятно, предполагалось лиз здесь hp или дополнительное свойство health, поэтому я влючила это свойство в класс
    }
    fun calculatePower2(): Int {
        return hp * aggressionLevel

    }

}