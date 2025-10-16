# Cw6JavaKlasyDziedziczenieKt
![img.png](img.png)
```kotlin
package komputery

open class Komputer(
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
```