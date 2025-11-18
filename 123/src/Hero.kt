package characters/*
    fun hello() {
        println("i`m $name, My journey is just beginning.")
    }



    fun meditate() {
        println("$name медитирует")
        this.mp += 20
        println("мана восстановлена, текущая  = $mp")
    }

    fun dead() {
        if (hp == 0) {
            println("hero dead")
        }
    }

    fun takedamage(amount: Int) {
        println("$name получил урон $amount")
        this.hp -= amount
        if (hp > 0)
            println("текущее здоровье $hp")
        if (hp == 0) {
            dead()
        }
    }
    fun greet (name: String){
        println("Hi, $name")
    }
    fun attack(enemy: characters.Enemy,Damage: Int){
        println("$name атакует врага ${enemy.name}")
        enemy.takeDamage(Damage)
    }

    fun CastSpellOn(enemy: characters.Enemy, spellname: String, damage: Int) {
        println("$name использует заклинание $spellname против ${enemy.name}")


        fun duel(opponent: characters.Hero){
            println("Дуэль между $name и ${opponent.name} начинается!")
            println("$name атакует первым!")
            opponent.takedamage(15)
            println("${opponent.name} отвечает!")
            this.takedamage(15)

            println("Дуэль завершена!")
            println("Состояние героев: ")
            this.status()
            opponent.status()
        }




    }*/