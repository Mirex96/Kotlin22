//22. Создать абстрактный класс Shape и его наследников Circle, Rectangle.
//   Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
//   Классы Circle, Rectangle содержат координаты точек.
//   Создать 5 классов и поместить в массив.
//   Пробежаться по массиву и вызвать метод .draw() у этих классов.
abstract class Shape {
    abstract fun draw()
    val colour = ""

}

class Circle() : Shape() {
    override fun draw() {
        println("Круг")
    }

    val coordinates: Double = 45.1

}

class Rectangle() : Shape() {
    override fun draw() {
        println("Прямоугольник")
    }

    val coordinates: Double = 32.5
}

class Square() : Shape() {
    override fun draw() {
        println("Квадрат")
    }
}

class Triangle() : Shape() {
    override fun draw() {
        println("Труегольник")
    }
}

class Oval() : Shape() {
    override fun draw() {
        println("Овал")
    }
}

fun main() {
    val circle = Circle()
    val rectangle = Rectangle()
    val square = Square()
    val triangle = Triangle()
    val oval = Oval()

    println("Координаты прямоугольника: ${rectangle.coordinates.toString()}")
    println("Координаты круга: ${circle.coordinates.toString()}")
    val massive = arrayOf(circle, rectangle, square, triangle, oval)
    massive.forEach { el -> el.draw() }
}