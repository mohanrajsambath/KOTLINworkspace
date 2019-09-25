package com.experiments.classesandobjects.basicexclasses


/*Note that parameters of the primary constructor can be used in the initializer blocks.
 They can also be used in property initializers declared in the class body:*/
class Customer(name:String) {
    val customerKey=name.toUpperCase()
    fun doPrint(){
        println("Second Initializer block that prints ${customerKey.length}")
    }

}