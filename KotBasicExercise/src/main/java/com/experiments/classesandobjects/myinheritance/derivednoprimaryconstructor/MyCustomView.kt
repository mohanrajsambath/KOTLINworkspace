package com.experiments.classesandobjects.myinheritance.derivednoprimaryconstructor

import android.content.Context
import android.util.AttributeSet
import android.view.View


/*If the derived class has a primary constructor, the base class can (and must) be initialized right there, using the parameters of the primary constructor.

If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword, or to delegate to another constructor which does that. Note that in this case different secondary constructors can call different constructors of the base type*/
class MyCustomView : View {
    constructor(ctx:Context):super(ctx)
    constructor(ctx:Context,attrs: AttributeSet):super(ctx,attrs)
}