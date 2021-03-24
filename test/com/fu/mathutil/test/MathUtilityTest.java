/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathultil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HuuToan
 */
public class MathUtilityTest {
    
//    ta sẽ viết những đoạn code ở đây để test những cái hàm chính getFactorial()
//    bên MathUtility coi mày chạy có đúng hay không
//    viết code để test code chính
//    đúng sai ở đây  chúng toi dùng màu sắc XANH ĐỎ
    
    
    @Test  //biến hàm thruonwgf thành hàm main()
    //shift-F6 để chạy 
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
       
        int n = 5; // tui muốn tính 5 này
         long expected  = 120; // tui hy vọng trả về 120
         long actual = MathUtility.getFactorial(n);
         assertEquals(expected, actual);
         // nếu khớp thì màu xanh, sai lệch thì màu đỏ
         //màu xanh xuất hiện khi tất cả các tình huống xàm hàm (test case) đều màu xanh
         // màu đỏ xuất hiện khi ngay khi có ít nhất 1 thằng đỏ( một test case sai , tất cả bỏ đi
         // ẩn ý: hàm đã đúng thì phải đúng cho tất cả các tình huống mình test
         
         assertEquals(720, MathUtility.getFactorial(6)); //6! có đúng là 720 hay k?
         assertEquals(24, MathUtility.getFactorial(4));
         assertEquals(6, MathUtility.getFactorial(3));
         assertEquals(2, MathUtility.getFactorial(2));
         assertEquals(1, MathUtility.getFactorial(1));
         assertEquals(1, MathUtility.getFactorial(0));
         
    }// khi màu đỏ thì có 2 tình huống: hàm bạn tính sai ko như kì vọng
    //hàm tính đúng, bạn kì vọng sai
    
    //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay ko
    //hàm được thiết kế rằng: đưa tham số n..20 -> tính đúng n!
    //hàm đc thiết kế rằng: đưa tham số cà chớn , <0>20 ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính !
    //chốt: đưa tham số cà chớn phải ném về ngoại lệ
    // nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn thì kết luận hàm đúng, XANH
    //thấy ngoại lệ khi đưa n cà chớn, mừng rơi nước mắt vì hàm chạy đúng như thiết kế
    // ngoại lệ xuất hiện khi 5! thì là hàm đúng mà
    // ngoại lệ thì ko phải là giá trị để so sánh kiểu assertEquals()
    // vậy ta phải dùng kiểu khác!!!
     //@Test(expected = Exception.class)// ko nên bắt mức cao nhất mặc dù ko sai
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
        
    }//cá luôn 2 thằng này phải ném về ngoại lệ IllegalArgumentException
    
  
}
