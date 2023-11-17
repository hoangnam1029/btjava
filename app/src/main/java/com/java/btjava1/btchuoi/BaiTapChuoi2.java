package com.java.btjava1.btchuoi;

public class BaiTapChuoi2 {
//    Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi,
// nếu không thì in ra “Không tồn tại trong chuỗi”.
    public static void main (String[] args){
        String chuoi = "abcdefb";
        char kyTu = 'b';
        boolean tonTai = false;
        System.out.print("Vị trí của ký tự: ");
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                System.out.print((i + 1) + " ");
                tonTai = true;
            }
        }

        // Kiểm tra và hiển thị kết quả
        if (!tonTai) {
            System.out.println("Không tồn tại trong chuỗi.");
        }
    }
}
