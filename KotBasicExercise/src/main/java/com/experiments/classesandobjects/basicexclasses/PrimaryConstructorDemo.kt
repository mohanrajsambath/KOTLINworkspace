package com.experiments.classesandobjects.basicexclasses


/*The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.

During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:*/
class PrimaryConstructorDemo(name:String) {
    val firstProperty="First property:$name".also(::println)
    init{
        println("First Initializer block that prints ${name}")
    }
    val secondProperty ="Second property:${name.length}".also (::println)
    init{
        println("Second Initializer block that prints ${name.length}")
    }
}