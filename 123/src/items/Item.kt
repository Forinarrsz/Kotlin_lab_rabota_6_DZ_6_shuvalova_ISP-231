package items

class Item(var name: String, var price: Int) {

    fun DisplayInfo(){
        println("product: $name, Price: $price")
    }
}