package com.example.lab2_ph35419

fun main() {
    var listSV = mutableListOf<SinhVienModel>()

    val sv1 = SinhVienModel("Nguyen Van Long", "ph3333", 3.5f)

    val sv2 = SinhVienModel("Le Tuan Anh", "PH14572", 8.5f, false, 20)

    // chèn dữ liệu
    sv2.daTN = true
    sv2.tuoi = 21

    // tạo danh sách và thêm đối tượng vào ds
    listSV.add(sv1)
    listSV.add(sv2)

    // làm việc với null safety
    println("-------------------MENU-----------------")
    println("1.In danh sách sinh viên")
    println("2.Thêm sinh viên mới")
    println("3.Xóa sinh viên")
    println("----------------------------------------")


    var choice: Int?

    do {
        println("Mời lựa chọn chức năng")
        choice = readLine()?.toIntOrNull()
        while (choice == null || choice < 0 || choice > 3) {
            println("Lựa chọn không có trong menu,hãy nhập lại:")
            choice = readLine()?.toIntOrNull()
        }
        when (choice) {
            1 -> {
                for (sv in listSV.indices) {
                    println("${sv + 1}." + listSV.get(sv).getThongTin())
                }
            }

            2 -> {
                var DATN: Boolean = false

                println("Mời nhập mã sinh viên mới :")
                val maSV = readLine()
                println("Mời nhập tên sinh viên mới :")
                val tenSV = readLine()
                println("Mời nhập điểm sinh viên mới :")
                val diemSV = readLine()?.toFloatOrNull()

                println("Mời nhập tuổi sinh viên mới :")
                val tuoiSV = readLine()?.toIntOrNull()
                println("Mời trạng thái tốt nghiệp sinh viên mới :")
                val daTNSV = readLine()?.toBoolean()

                val daTN = daTNSV ?: false
                var svMoi =
                    SinhVienModel(tenSV ?: "", maSV ?: "", diemSV ?: 0.0f, daTN, tuoiSV ?: 0)
                listSV.add((svMoi))
                println("Đã thêm thành công sinh viên ! In danh sách ngay nhé ? (y/n)")
                var chon = readLine()
                while (chon != null || chon != "y" || chon != "n") {
                    println("Lỗi nhập liệu, vui lòng đọc kĩ yêu cầu và nhập lại !")
                    chon = readLine()
                }
                if (chon == "y") {
                    for (sv in listSV.indices) {
                        println("${sv + 1}." + listSV.get(sv).getThongTin())
                    }
                } else {
                    break
                }
            }

            3 -> {
                println("Nhập index sinh viên muốn xóa:")
                choice = readLine()?.toIntOrNull()
                while (choice == null || choice < 0 || choice > listSV.size) {
                    println("Nhập liệu lỗi,hãy nhập lại:")
                    choice = readLine()?.toIntOrNull()
                }
                listSV.removeAt(choice)
                println("Đã xóa sinh viên !")
            }
        }

        println("Có tiếp tục không? (y/n)")
        choice = readLine()?.toIntOrNull()
        if (choice.toString() == "n") {
            break
        }

    } while (true)


}




