package com.example.lab2_ph35419

fun main() {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuận !")
    println("_______________________________")
    do {
        println("Nhập năm bạn muốn kiểm tra:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Có lỗi nhập liệu, hãy nhập lại:")
            s = readLine()
        }

        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuận")
        } else {
            println("Năm $year ko phải năm nhuận")
        }
        println("Tiếp ko(c/k)?")
        s = readLine()
        if (s == "k")
            break;

    } while (true)
    println("Kết thúc chương trình")
}

class bai3 {

}