package com.java.btjava1.btchuoi;

public class BaiTapChuoi3 {
//    Viết chương trình cho phép nhập vào một chuỗi,
//    kiểm tra xem chuỗi này có xuất hiện số hay không.
//    Nếu có tin ra “Có”, ngược lại, in ra “Không”.
    public static void main(String[] args){
        String chuoi = "abcxyz1";
        boolean kiemSo = false;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                kiemSo = true;
                break;
            }
        }
        if(kiemSo){
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
    }
}
