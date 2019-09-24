package mohan.com.mykotlinexperiments.classesandobjects.inheritancepack.overridingmethods


/*
 As we mentioned before, we stick to making things explicit in Kotlin. So, Kotlin requires explicit modifiers for overridable members (we call them open) and for overrides
 */
open class Geometry {
    open fun findArea(){}
    open fun findPerimeter(){}

    open fun justPrint() { println("---=>Geometry JustPrint method executed") }

}