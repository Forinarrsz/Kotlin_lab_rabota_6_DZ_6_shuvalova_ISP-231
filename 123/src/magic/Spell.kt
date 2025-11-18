package magic

class Spell {
    var name: String
    var width: Int
    var height: Int
    var symbol: String

    constructor(name: String, width: Int, height: Int, symbol: String) {
        this.name = name
        this.symbol = symbol
        this.height = height
        this.width = width
    }
    fun cast() {
        println("Кастуем $name")
        repeat(height) {
            repeat(width)
            { print(symbol) }
            println()
        }
    }
    fun area(): Int {
        return width*height
    }
    fun description(): String {
        return  "Заклинание $name занимает область ${width}х${height} и использует символ: $symbol"
    }

}