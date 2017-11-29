package test

import java.util.*

infix fun Date.fromDate(from: java.util.Date) = this.time - from.time
class Functions {
    //private variable
    private var value = ""

    //Date infix notation
    companion object Static {
        infix fun Date.toDate(to: java.util.Date) = to.time - this.time
        fun simpleComp() {
            System.out.println("Hi companions ")
        }


    }

    //First class functions
    fun normalFunction(): Int = 19

    val firstClass = fun(): Int = 4
    inline fun inlineFirstClass(): Int = 4
/*    val notPossible = {a:Int,b:Int,c:Int,d:Int,e:Int,f:Int,g:Int,h:Int,i:Int,j:Int,k:Int,l:Int,m:Int,n:Int,o:Int,p:Int,q:Int,r:Int,s:Int,t:Int,
                       u:Int,v:Int,w:Int,x:Int,y:Int,z:Int -> x}*/


    //Simple lambda.
    val adder = { firstNum: Int, finalNum: Int -> { secondNum: Int -> firstNum + secondNum + finalNum } }
//    val test = { number: Int -> number + 4 }

}