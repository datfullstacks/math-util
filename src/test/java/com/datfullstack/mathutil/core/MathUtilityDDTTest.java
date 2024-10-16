package com.datfullstack.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // @Test  là 1 phần cuar annotation của framework beien các cái hàm của ta thanh hàm main
    // .. đeer có thể run  ham bt chi có thể trong main() để chạy
    // @Test biến hàm bất kỳ thành main()
    // kỹ thuật ddt data driven testing là kỹ thuật tách bộ data kiểm thưr ra
// khoi các câu lệnh kiểm thử mục đích giúp developer nhìn nhanh được xme
    // bộ testcase còn thiều case nào hay không
    // kỹ thuật này còn gọi tên khác laf tam só hóa bộdataa kiểm thử parameterized testing
    // ta làm riền 1 hàm phải là static để lưu bộ data kiểm thưr
    public  static  Object[][] initTestData() {
        return new Object[][]
                {
                        {
                            0,1
                        },
                        {
                            1,1
                        },
                        {
                            2,2
                        },
                        {
                            3,6
                        },
                        {
                            4,24
                        },

                        {
                            5,120
                        },
                        {
                        6,720
                },
        };
    }

    public  static  Integer[] initTestDataForCheckingException(){
        return new Integer[] { -1, -2, -3, -4, -5, -100, 21, 22, 23, 24, 100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactoriakGivenWrongArgumentThrowsException(int n){
        assertThrows(IllegalArgumentException.class ,() -> { MathUtility.getFactorial(n);});

    }
    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgument5RunsWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
@Test
    void test() {

    }
}