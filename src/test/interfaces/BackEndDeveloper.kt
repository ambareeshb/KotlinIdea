package test.interfaces

interface BackEndDeveloper:Developer{
    override fun writeApi() {
        println("Hola from backend: ")
        super.writeApi()
    }

}
