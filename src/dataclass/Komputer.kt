package dataclass

data class Komputer(
    val producent: String,
    val model: String,
    val rokProdukcji: Int
) {
    fun wlacz() {
        println("Komputer się uruchamia ...")
    }
}
