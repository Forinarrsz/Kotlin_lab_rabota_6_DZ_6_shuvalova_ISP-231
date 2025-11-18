import magic.Spell
import characters.Hero
import characters.Enemy
fun main() {
    val sword = Itemdz("Меч", "Оружие", 100)
    val armor = Itemdz("Кольчуга", "Броня")
    sword.printInfo()
    armor.printInfo()

    val forest = Location("Темный лес", "Высокий", 5)
    println("Лес опасен? ${forest.isDangerous()}")

    val spell = Spell("Огненный шар", 3, 4, "*")
    val hero = Hero("Артур", "М", "Король", 200, 120, "Огонь", 2)
    println("Герой может использовать заклинание? ${hero.canCast(spell)}")

    val goblin = Enemy("Гоблин", 50, element = "Ice", 2, 230 )
    println("Сила гоблина: ${goblin.calculatePower()}")
    val goblin2 = Enemy("Гоблин", 50, element = "Ice", 2, 230 )
    println("Сила гоблина: ${goblin2.calculatePower2()}")
}