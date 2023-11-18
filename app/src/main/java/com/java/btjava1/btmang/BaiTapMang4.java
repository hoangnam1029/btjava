package com.java.btjava1.btmang;

public class BaiTapMang4 {
//    Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//    Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
    public static void main (String[] args){
        int[] mang = {3, 2, 6, 3, 4};
        for(int i = mang.length -1; i >= 0; i--){
            System.out.println(mang[i]);
        }
    }
}
