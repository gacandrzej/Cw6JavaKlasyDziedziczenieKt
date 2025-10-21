package dataclass


    fun main() {
        val komputer = Komputer("HP", "EliteBook", 2023)
        println(komputer)
        komputer.wlacz()

        val k1 = Komputer("Dell", "XPS", 2022)
        val k2 = k1.copy(model = "Latitude") // zmieniamy tylko model

        println(k1)
        println(k2)

        println(k1 == k2) // false, bo model się różni
    }

