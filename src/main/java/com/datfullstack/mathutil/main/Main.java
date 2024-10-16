package com.datfullstack.mathutil.main;

import static com.datfullstack.mathutil.core.MathUtility.*;



public class Main {
    public static void main(String[] args) {
//        testFactorialGivenRightArgumentRunsWell();

    }

    //testcase #2
    //description: Check getFactorial() method with vaild argument(n=1)

    //Steps/procedures (cach test  casc buoc verify ham chucws anwng
    //call function  method with n=1  getfactorial(1)

    // expected result: (hy vonjg goij 1! gias trij trarveef laf mayas
    // to have 11111 as the result of 1
//`      => Passed
    //status (passed or failed) minhf phair tun ham va nhin gia tri moiws biet
    // chay test case  / lam cac buoc o tren de xac dinh duoc ham dung sai goi la test run
    static void testFactorialGivenRightArgument1RunsWell(){

            System.out.println("1! expected value: 120 \n actual value:" + getFactorial(5) );




    }

    //    Testcase #3
    static void testFactorialGivenRightArgument2RunsWell(){

        int n = 5;
        long expectedResult = 120;
        long actualResult = getFactorial(n);
        System.out.println("5! expected value:" + expectedResult + " actual value:" + getFactorial(n));
//         so sanh bang mat de luan ket qua dung sai



    }
    // cac test case de duoi day de run trong main
    static void testFactorialGivenRight11Argument0RunsWell(){
        // test case 1
        // Description: check Getfactorial function with argument (n= 0_)
        // Steps:
        // Call function/method with n - 0 getFractorial(0)


        //expected result:
        //  Get 1 as the result of 0
        //actual result/status (passed,failed) (waiting for  test run)
        // test run: run cais test case
        long expectedResult = 1;
        long actualResult = getFactorial(0);
        System.out.println("expected value:" + expectedResult + " actual value:" + actualResult);
    }

    //Testcase #4
    //Description: TEST FACTORIAL WITH INVALID ARGUMENT EG: N= -5

    //EXPECTED REUSLT
        // AN EXCEPTION IS THROW  - KY VONG 1 NGOAI LE XUAT HIEN


    //DIEN DAI THEM HÀM CỦA




}
