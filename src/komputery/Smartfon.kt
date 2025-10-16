package komputery

class Smartfon(
    producent: String = "",
    model: String = "",
    rokProdukcji: Int = 0,
    var systemOperacyjny: String = "",
    var iloscPamieci: Int = 0
) : Komputer(producent, model, rokProdukcji) {

    override fun toString(): String {
        return "Smartfon(producent='$producent', model='$model', rokProdukcji=$rokProdukcji, " +
                "systemOperacyjny='$systemOperacyjny', iloscPamieci=$iloscPamieci)"
    }

    override fun wlacz() {
        println("Smartfon się uruchamia ... $systemOperacyjny")
    }
}