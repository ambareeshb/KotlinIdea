import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const
import test.*
import test.Functions.Static.toDate
import test.interfaces.SuperDeveloper
import java.util.*


fun main(args: Array<String>) {
    //Variables
    var mutableVariable = 2
    var mutableOptionalVariable: Int? = null
    val immutableVariable = 3
    System.out.println("$mutableOptionalVariable,$mutableVariable,$immutableVariable")

    //Functions
    testFunctions()

    testSingletons()


    //Infix
    testInfix()

    //Companions
    Functions.simpleComp()

    //Lambda
    testLambda()

    //Map testing
    testMap()

    //Sealed and Enum
    val winterTournament = listOf(Tournaments.Manager,
            Tournaments.Player("Unni", "Bamboo boys"),
            Tournaments.Team("Bamboo boys"))
    println("Sealed type is ${winterTournament::class.qualifiedName}")
    for (value in winterTournament) {
        println("Sealed type is ${value::class.qualifiedName}")
        println(value)
    }

    //Delegates
    TestDelegate().userName = "second value" //Observable
    val lazyVal = TestDelegate().userLazyRole //Lazy Delegate
    println("Lazy propery calling second time is $lazyVal ")
    TestDelegate().mapIt(mapOf("name" to "ruky", "age" to 21)) //Map Delegate
    var customDelegate by CustomDelegate()
    println("Custom delegate value is $customDelegate")
    customDelegate = "The white car with blue paint"
    //Interfaces
    SuperDeveloper().writeApi()

}

fun testFunctions() {
    Functions().apply {
        normalFunction()
        firstClass()
        inlineFirstClass()
//        notPossible(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,1,7,18,
//                19,2,0,21,22,23,26)
    }
}

fun testLambda() {
    val adder = Functions().adder
    val add5 = adder(5, 4)
    System.out.println("Lambda curry add add5(3) : ${add5(3)}")
}


fun testSingletons() {
    val baseUrl = Constants.BASE_URL
    val path = Constants.PATH1
}

fun testInfix() {
    val now = Date()
    val future = Date(now.time + 10000)
    val diffTo = now toDate future
    val diffFrom = future fromDate now
    System.out.println("The difference is $diffTo \n difference type is ${diffTo::class.qualifiedName}")
    System.out.println("The difference is $diffFrom \n difference type is ${diffFrom::class.qualifiedName}")
}

fun testMap() {
    val immutableMap = mapOf(1 to 1, 2 to 2, 3 to 3)
    val mutableMap = mutableMapOf(1 to 1, 2 to 2, 3 to 3)
}


/**
 *print number of spaces given in terminal.
 */
fun printSpacesAndTitle(spaces: Int, title: String) {
    for (spaceCount in 0 until spaces) println("\n")
    println("$title \n")
}
