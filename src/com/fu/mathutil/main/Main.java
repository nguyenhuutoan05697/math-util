/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathultil.MathUtility;

/**
 *
 * @author HuuToan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tui mún test xem 5! có bằng 120 ko?
        long expected = 120; // tui hy vọng 120 là giá trị tra về
        int n = 5;          //nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
                        //actual: cái value hàm thực sự trả về
        //ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay ko
        System.out.println("5!: Expected: "+ expected + "; Actual: "+ actual);
        
        //tình huống test số 2, 0! xem sao?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
     
        n = 0; // tui mún tính 0!
        expected = 1; // hi vọng nhận về 1
        actual = MathUtility.getFactorial(n);// còn thực tế là
        //dùng mắt để luận kết quả again
        System.out.println("5!: Expected: "+ expected + "; Actual: "+ actual);
        
        
        
//        System.out.println("Hello to Github");
//        System.out.println("This is 1St upload connects to remote Github server");
    }
    
}

// Trong quy trình lập trình chuyền nghiệp/ ở các công ty, đặc biệt làm cho JP
//mọi hàm/ class bạn viết ra đều phải test kĩ càng trước khi ghép nó 
//vào trong các cụm tính năng, và ghép với UI, Back-end
//Làm sao để test các hàm, các class
//Dân dev có nhiều cách
//1. Cách 1: sout(kết quả xử lí của hàm)
//2. Cách 2: JOptionPane(pop-up lên kết quả xử lí hàm) bên Jave Desktop
//3. Cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xử lí ra 1 trang web tạm nào đó
//VỚI 3 CÁCH NÀY, ta gọi hàm, nhìn kết quả trả về của hàm- ACTUAL VALUE
//và ta ngầm so sanh với các kết quả mà ta tự tính toán trước đó
// khi chưa gọi hàm - ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE
//nếu EXPECTED VALUE == ACTUAL VALUE( thực tế và kĩ vọng khớp nhau)
// Á ĐÙ, Hàm chạy đúng
//nếu ko bằng, Đù má , HÀM XỬ LÍ SAI
//3 CÁCH TRÊN ĐÒI HỎI DEV PHẢI DÙNG MẮT ĐẺ LUẬN KẾT QUẢ ĐÚNG SAI
//nếu nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
//KĨ THUẬT TEST NHƯ Ở TRÊN GỌI LÀ MANUAL TEST
//TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST
//CÒN CÁCH XỊN XÒ THỨ 4

//TA KHÔNG CẦN NHÌN BẰNG MẮT TỪNG TRƯỜNG HỢP SỬ DỤNG HÀM
//TA NHỜ MÁY SO SÁNH DÙM ACTUAL VỚI EXPECTED LUÔN
//VÀ NẾU TẤT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP, BẰNG NHAU, NÉM RA 1 MÀU XANH
//NẾU HẦU HẾT ĐỀU KHỚP, CHỈ CÓ ÍT  NHẤT 1 CÁI KHÔNG KHỚP, HÀM KHÔNG ỔN ĐỊNH
//NÉM RA MÀU ĐỎ -> CẢNH BÁO DÂN DEV CODE CÓ TRỤC TRẶC
//VẬY LÚC NÀY TA CHỈ NHÌN MÀU LÀ ĐỦ, KO CÂN LUẬN TỪNG KẾT QUẢ
//KĨ THUẬT NÀY GỌI LÀ TEST DRIVEN DEVELOPMENT + TEST AUTOMATION
//vừa viết code vừa test                      tự động hóa việc test
//
//MUỐN LÀM ĐC ĐIỀU NÀY, TA CẦN THÊM THƯ VIỆN PHỤ TRỢ ĐỂ TUNG RA MÀU
//THƯ VIỆN NÀY ĐỀU CÓ TƯƠNG ỨNG Ở CÁC NGÔN NGỮ LẬP TRÌNH
//JAVA : JUnit, TestNG...
//C# : NUnit, xUnit, MSTest
//PHP :PHPUnit
//.......

