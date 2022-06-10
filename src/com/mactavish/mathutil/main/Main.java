/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mactavish.mathutil.main;

import com.mactavish.mathutil.core.MathUtil;

/**
 *
 * @author light
 */
public class Main {

    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        // ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        // ví dụ : -5 coi tính đc hok
        // 0 coi tính mấy
        // 20 coi tính mấy
        // 21 coi tính ra mấy !!!
        // TEST CASE : Một tình huống hàm / app / màn hình / tính năng đc đưa vào sử dụng
        // giả lập hành vi xài của ai đó !!!

        // TEST CASE : LÀ 1 TÌNH HUỐNG SỬ DỤNG , XÀI APP HAY XÀI HÀM MÀ NÓ BAO GỒM :
        // INPUT : DATA ĐẦU VÀO CỤ THẺ NÀO ĐÓ
        // OUTPUT : ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM / CHỨC NĂNG CỦA APP , DĨ NHIÊN DÙNG ĐẦU
        // VÀO ĐẺ XỬ LÍ
        // KÌ VỌNG : MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        // SO SÁNH ĐẺ XEM KÉT QUẢ CÓ NHƯ KÌ VỌNG HAY KO
        long expected = 5040; //expected
        int n = 7; //input
        long actual = MathUtil.getFactorial(n);
        System.out.println(n + "! = " + expected + " (expected); actual : " + actual);

    }

}
