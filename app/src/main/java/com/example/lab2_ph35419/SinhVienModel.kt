package com.example.lab2_ph35419

class SinhVienModel(val tenSV: String, var mssv: String, var diemTB: Float) {
    var daTN: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String,mssv: String,diemTB: Float,daTN:Boolean,tuoi:Int):this(tenSV,mssv,diemTB){
        this.daTN=daTN
        this.tuoi=tuoi
    }

    fun getThongTin(): String {
        val thongtin: String
        if (daTN != null && tuoi != null) {
            thongtin = "Tên: $tenSV, mssv: $mssv, diemtb: $diemTB, daTN: $daTN,tuoi :$tuoi"

        } else {
            thongtin = "Tên: $tenSV, mssv: $mssv, diemtb: $diemTB"
        }

        return thongtin
    }
}