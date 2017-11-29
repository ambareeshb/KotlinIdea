package test.interfaces

class SuperDeveloper : BackEndDeveloper, MobileDeveloper {
    override fun writeApi() {
        super<MobileDeveloper>.writeApi()
    }

    fun someRandomFunction() {

    }
}