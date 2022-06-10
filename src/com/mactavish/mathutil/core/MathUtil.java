/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mactavish.mathutil.core;

/**
 *
 * @author light
 */
public class MathUtil {

    // trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    // clone class Math của JDK
    // hàm thư viện xài chung cho ai đó , ko cần lưu lại trạng thái / giá trị
    // chọn thiết kế là hàm static
    // hàm tính giai thừa !!!
    // n ! = 1.2.3.4 ... ns
    // ko có giai thừa cho số âm
    //0 ! = 1 ! = 1 quy ước
    // giai thừa hàm đồ thị dốc đúng , tăng nhanh về giá trị
    // 20 giai thừa 18 con số 0 , vừa kịp đủ cho kiểu long của Java
    // 21 giai thừa tràn kiểu long
    // bài này quy ước tính n ! trong khoảng từ 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        }

        if (n == 0 || n == 1) {
            return 1; //ket thuc cuoc choi neu thay gia tri khac biet
        }

        long product = 1; //tich nhan don, thuat toan heo dat, oc bu don thit
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
