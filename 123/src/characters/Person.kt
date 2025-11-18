package characters

import world.Quest

fun main() {
    val naruto: Hero = Hero("Naruto", "M", "Shinobi", 5, 150, level = 2, element = "Огонь")
    println("name: ${naruto.name}, gender: ${naruto.gender}, class: ${naruto.role}, hp: ${naruto.hp}, mana: ${naruto.mp}, element: ${naruto.element}")
    naruto.status()
    val kakashi = Hero("Какаши", "М", "Шиноби", 250, 300, "Молния", level = 3)

    naruto.name = "Naruto"
    naruto.gender = "Man"
    naruto.role = "Hokage"
    naruto.hp = 200
    naruto.mp = 150

   /* val sasuke = characters.Hero()
    sasuke.name = "Саске учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp =180

    println("name: ${sasuke.name}, gender: ${sasuke.gender}, class: ${sasuke.role}, hp: ${sasuke.hp}, mana: ${sasuke.mp}")

val hero = characters.Hero()
    println("ВВедите имя")
    hero.name = readln()
    println("Введите пол (м; Ж)")
    hero.gender = readln()
    println("Введите класс:")
    hero.role = readln()
    println("Введите Здоровье")
    hero.hp = readln().toInt()
    println("Введите ману:" )
    hero.mp = readln().toInt()

    println("name: ${hero.name}, gender: ${hero.gender}, class: ${hero.role}, hp: ${hero.hp}, mana: ${hero.mp}")
    val oruchimaru = characters.Enemy()
    oruchimaru.name = "Оручимару"
    oruchimaru.element = "Ветер"

val oruchimaru = characters.Enemy()
    oruchimaru.name = "Oruchimaru"
    naruto.status()
    println("Наруто увидел врага ${oruchimaru.name}! Его здоровье - ${oruchimaru.hp}")
    naruto.attack(oruchimaru,23)

    val qst = world.Quest("Драка с Ведьмаком", 2, 3400, "Сложный")
    qst.printInfo()
    */

    val hero1 = Hero(name = "Artur", hp = 100, gender = "M", role = "King", mp = 250, element = "Magic", level = 5)
    println("Герой жив? ${hero1.IsAlive()}")
    val hero2 = Hero(name = "Artur", hp = 0, gender = "M", role = "King", mp = 250, element = "Magic", level = 4)
    println("Герой жив? ${hero2.IsAlive()}")

    val hero = Hero(name = "Artur", level = 4, element = "Fire", gender = "M", hp = 120, mp = 250, role = "King")
    val easyQuest = Quest("Сбор трав", 2, 100, "легкий")
    val hardQuest = Quest("Драка с ведьмаком", 10, 100, "сложный")
    hero.CanAcceptQuest(easyQuest)
    hero.CanAcceptQuest(hardQuest)

    val enemy1 = Enemy("Goblin", 30, "Fire", 30,78)
    println(enemy1.getThreatLevel())

    val enemy2 = Enemy("Ork", 100, "Ice", 34, 56)
    println(enemy2.getThreatLevel())

    val enemy3 = Enemy("Dragon", 30, "Bomb",38,84)
    println(enemy3.getThreatLevel())

    val qst1 = Quest("Охота", duration = 2, reward = 300, difficulty = "средний")
    println(qst1.goldPerHour())
    val qst2 = Quest("Рыбалка", duration = 0, reward = 500, difficulty = "легкий")
    println(qst2.goldPerHour())
}