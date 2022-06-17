package com.tom.com.tom

class Student(var name:String,var english:Int,var math:Int) {
   init {
   //        println("Testing")
   }
    fun print(){
        println("＄name\t＄english\t＄math\t＄{getAverage()}")      //錢大括號
    }

    fun getAverage() = (english+math) / 2    //下面的簡潔版
    //  fun getAverage() : Int {  return(english+math)/2  }

}
fun main(){
    val stu = Student("Jack",55,87 )
    stu.print()
}