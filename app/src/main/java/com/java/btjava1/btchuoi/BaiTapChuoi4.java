package com.java.btjava1.btchuoi;

public class BaiTapChuoi4 {
//    Viết chương trình cho phép nhập vào một chuỗi
//    Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//    In ra số lần đó.
    public static void main(String[] args){
        String chuoi = "abcxyz";
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự a: " + dem);
    }
}
