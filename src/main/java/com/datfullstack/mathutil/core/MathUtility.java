package com.datfullstack.mathutil.core;
//create library provide utility relative math
// vì là đồ tiện ích dùng chung tool có nhiều nơi sử dụng  -> hàm static
public class MathUtility {
    // ham tinh n! = 1.2.3
    // ko tinh giau thua so am
    // 0! =1! = 1
    // 20! vừa đủ kiểu long 18 con so 0
    // bai na k choi vs 21!trở lên

    public static long getFactorial(int n){
        if (n<0 || n>20){
            throw new IllegalArgumentException(" Invalid number. n must between 0 .. 20");
        }
        if (n== 0 || n==1){
            return 1;
            // sống sót đến chỗ này n=2-3-4-5
        }
        long result =1;
        for (int i = 2; i <= n ; i++) {
            result *= i;
        }
        return result;
    }

}
