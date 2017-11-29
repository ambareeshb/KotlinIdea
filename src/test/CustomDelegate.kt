package test

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class CustomDelegate:ReadWriteProperty<Any?,String>{
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Boom Shaka Lak"
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("The property value is $value")

    }

}
