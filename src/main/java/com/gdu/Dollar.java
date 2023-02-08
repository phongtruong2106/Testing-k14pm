/*
*  created date: Feb 01, 2023
*  author: cgm
*/
package com.gdu;

public class Dollar {
    int soTien;//mutate - biến đổi
    public Dollar(int soTien){
        this.soTien = soTien;

    }

    Dollar nhan(int soNhan){
        return new Dollar(soNhan * this.soTien);

    }
    
}
