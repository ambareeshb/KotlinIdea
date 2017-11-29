package test

import kotlin.properties.Delegates


class TestDelegate {

    var userName: String by Delegates.observable("no name"){
        property, oldValue, newValue -> println("$oldValue -> $newValue the prop[${property.name}]")
}
    val userLazyRole: String by lazy {
        println("Computing Lazy value")
        "Manger"
    }

    fun mapIt(map: Map<String,Any>){
        val name by map
        val age by map
        println("Name is $name and age is $age")
    }
}
