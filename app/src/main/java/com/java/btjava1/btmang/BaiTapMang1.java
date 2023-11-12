package com.java.btjava1.btmang;

public class BaiTapMang1 {

    /*
    * Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
        Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
    * */

    public static void main(String[] args) {
        int n = 10;
        int[] mang = {3, 2, 6, 3, 4};
        int sum = 0;

        // cach 1:
//        for (int i = 0; i <mang.length; i++) {
//            sum = sum + mang[i];
//
//        }
//
//        int phanNg = sum / mang.length;
//        int phanDu = sum % mang.length;
//
//        System.out.println(phanNg + " "+  phanDu );


        //cach 2
        for (int item : mang) {
            sum = sum + item;

        }

        int phanNg = sum / mang.length;
        int phanDu = sum % mang.length;

        System.out.println(phanNg + " "+  phanDu );
    }
}
