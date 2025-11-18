package world

class Cotract(val ClientName: String, val TaskDescription: String, val reward: Int, val IsUrgent: Boolean = false) {

    fun PrintContractInfo(){
        println("Заказчик: $ClientName")
        println("Задача: $TaskDescription")
        println("Награда: $reward")
        println("Срочный ли конртакт?  ${if (IsUrgent) "Срочный" else "Обычный"}")
    }


}