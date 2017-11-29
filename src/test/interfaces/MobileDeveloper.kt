package test.interfaces

interface MobileDeveloper: Developer {

    override fun writeApi() {
        println("Mobile Developer : No I wont suppose to write any APIs")
    }
}
