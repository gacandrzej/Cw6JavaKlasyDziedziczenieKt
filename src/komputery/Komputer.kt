package komputery

open class Komputer(
    /**
     * val producent = "Dell" // nie można zmienić (final)
     * var model = "XPS"      // można zmienić
     */
    var producent: String = "",
    var model: String = "",
    var rokProdukcji: Int = 0
) {
    override fun toString(): String =
        "Komputer(producent='$producent', model='$model', rokProdukcji=$rokProdukcji)"

    open fun wlacz() {
        println("Komputer się uruchamia ...")
    }
}