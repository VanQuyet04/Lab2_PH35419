package com.example.lab2_ph35419

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("Nghiệm x=" + x)
    }


}
class bai1{

}