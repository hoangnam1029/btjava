package com.java.btjava1.btmang;

public class BaiTapMang2 {

    /*
    *Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
        Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
    * */

    public static void main(String[] args) {
        int[] mang = {3, 2, 6, 3, 4,10,15,9,80};
        int giatrilonnhat = 0;

        for (int i = 0; i < mang.length; i++) {

            if(mang[i] > giatrilonnhat ){
                giatrilonnhat = mang[i];
            }

        }


        System.out.println( "giatrilonnhat:  "+  giatrilonnhat );
    }
}
