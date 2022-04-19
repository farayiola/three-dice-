package com.example.diceapp

fun main () {
    val ship = Ship(10000)
    val truck = Truck(15000)
    println("\ntruck\n ============")
    println("Colour: ${truck.colour}")
    println("Name: ${truck.name}")
    println("Cost? ${truck.cost()}")

    println("\nship\n ============")
    println("Colour: ${ship.colour}")
    println("Name: ${ship.name}")
    println("Coat? ${ship.cost()}")

}
abstract class Car(private var budget : Int) {
    abstract val colour : String
    abstract val name : String
    abstract val price : Int


    fun cost() : Boolean {
        return budget > price
    }
}
class Truck(budget : Int) : Car(budget) {
    override val colour = "blue"
    override val name = "ford"
    override val price = 13600
}
class Ship(budget : Int) : Car(budget) {
    override val colour = "white"
    override val name = "toyota"
    override val price = 10000
}