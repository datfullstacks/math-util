package com.datfullstack.mathutil.core.test;


import  com.datfullstack.mathutil.core.MathUtility;



import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




class MathUtilityTest {

    @AfterEach
    void tearDown() {
    }
    // testcase #1
    // cau truc test case: ID description, step/procedures , expected result, actual result
    // status: passed , failed
    // Test Date, Bug # (bugid) luu tren Bugzila (Bug DB)
    // +
    @Test
    void getFactorial() {

    }
    @Test
     void testFactorialGivenRightArgument0RunsWell(){
        // test case 1
        // Description: check Getfactorial function with argument (n= 0_)
        // Steps:
        // Call function/method with n - 0 getFractorial(0)

        //expected result:
        //  Get 1 as the result of 0
        //actual result/status (passed,failed) (waiting for  test run)
        // test run: run cais test case

        // so ssanhs
        // truyen thong sout() in ket qua va nhin = mat doan dung sai
        // hien dai xai them tool thuw vien unit testing frame work jUnit
        // giup doi mat ta nhin ket qua dung sai qua 2 mau xanh va do
        // nao va mat khong can nhin doan ket luan nhu truyen thong
        // ma nay thay do => tach xanh => oonr

        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(720,MathUtility.getFactorial(6));
        assertEquals(5040,MathUtility.getFactorial(7));

    }
    // quy tac xanh do cua unit test tool framework
//    neu tat ca cac test case passed (ex == act) => mau xanh
//            neu ca 1 trong nhung testcase failed (ex !== act ) => mau do
//                ly do ham da dung thi phai dung het voi cac test case da dua ra !!1
//     ly mat chi nhin 2 tin hieu xanh do  theo style gop cac jket qua
//            xanh dung het do 1 thanh nao chet -> bo ham fix lai
//            ki thuat vie code
//
//    public chi getNhin() {
//        ham trong api, IconUIResource
//                ma di kem code test ham luon dung  2 trang thai xanh do  cu lien tujc code
//                xong chay xanh do sua chay lai xanh do toi uwu chi code chayj lai xanh
//                do xanh do lien tuc trong qua trinh viet code dc goi la tdd
//                test driven development viet code song hanh cung code test
//
//    }

    // so sanh bang mat de luan ket qua dung sai
    // test case #3  check getFractorial() with n = - 5 ... to see the exception
    /// toi muon thay ngoaij le xuat hien trong tinh huong n aam hoac n>20
    // ngoai le co xh nhu duw kien hay khong.. neu co thi phai mau xanh!!!
    // nghe ki co ngoai le nhung mau xanh vi ngoai le xh nhu du kien
    @Test
    void testFactoriakGivenWrongArgumentThrowsException(){
       assertThrows(IllegalArgumentException.class,() -> { MathUtility.getFactorial(-5);});
       assertThrows(IllegalArgumentException.class,() -> { MathUtility.getFactorial(22);});
    }
}

