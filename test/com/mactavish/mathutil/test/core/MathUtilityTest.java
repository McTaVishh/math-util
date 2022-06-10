/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mactavish.mathutil.test.core;

import com.mactavish.mathutil.core.MathUtil;
import java.text.NumberFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author light
 */
public class MathUtilityTest {
    //đây là class sẽ sdụng các hàm của thư viện/framework JUnit
    //để kiểm tra/ktra code chính - hàm tínhGiaiThừa() bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!

    //có nhiều quy tác đăt tên kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thànhc ông và thất bại!!
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    //@Test JUnit sẽ phối vợp với JVM để chạy hàm này
    //@Test phía huậ trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case kahsc nhau để kiểm thử hàm tính giai thừa
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng đc n! - done
    //2. đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //TA KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N >20
    //rất mong ngoại lệ xuất hiện với n cà chớn này
    //nếếu hàm nhận vào n <0 hoặc n> 20 và hàm ném ra ngoai lệ
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    //nếu hàm nhận vào n<0 hoặc n>20 và hàm éo ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    //TEST CASE:
    //input: -5 
    // expected: IllegalArgumentException xuatas hien
    //tình huống bất thường, ngoại lệ, ngooài dự tính, dự liêỵ
    //là nưhnxg thứ ko thể đo lường ssánh theo kiểu value
    //mà chỉ có thẻ đo lường = cách chugns có xuất hiện hay ko
    //assertEquals() ko dùng để ssánh 2 ngoại lệ
    //      Equals() là = nhau hay ko trên value
    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM GNOẠI LỆ THẬT SỰ
    //              NHƯNG KO PHẢI LÀ NGOẠI LỆ  NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //              KO PHẢI HÀM NÉM SAI
//    @Test (expected = NumberFormatException.class)
//    public void testaGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                   //sẽ ném về ngoại lệ NumberFormat
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testaGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
        //sẽ ném về ngoại lệ NumberFormat
    }

    //cách khác để bắt lại lệ xuất hiện, viết tự nhiên hơn!!
    @Test
    public void testGetFactorialGivenRightArgueMentReturnsWell() {
        int n = 0; //test thử hình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1; //hi vọng 0! = 1
//      long actual = ; //gọi hàm cần test bên core/app chính/code chính
        long acutal = MathUtil.getFactorial(n);

        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, acutal);

        //gộp thêm vài case thành công/ đưa đầu vào ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // mún 2! ==2
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));

    } //hàm giúp ssánh 2 giá trị nào đó có giống nhau hay ko
    //nếu giống nhau -> thảy màu xanh đèn đường - đường thông, code ngon
    //                      ít nhất cho case đang test
    //nếu KO GIỐNG NHAU      -> thảy màu đỏ đèn đường
    //                      hàm ý Expected và actual ko giống nhau

    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!
    //xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!             
    @Test
    public void testaGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {

//        Assert.assertThrows(tham số 1: loại ngoại lệ mún ssánh, 
//                            tham số 2: đoạn code chạy văng ra ngoại runnable);
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5));

    }

//Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testaGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //chủ động kiểm soát ngoại lệ!!
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chác ngoại lệ mình cần có xuất hiện ko>>
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArguementException xh
            Assert.assertEquals("Invalid argument. N must be between 0...20" , e.getMessage());
            
        }
    }

}
