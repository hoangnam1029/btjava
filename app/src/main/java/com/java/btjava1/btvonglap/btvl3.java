package com.java.btjava1.btvonglap;

public class btvl3 {
    //    Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//
//    In ra tất cả số nguyên tố trong khoảng từ 0 - n.
//
//    làm với 3 cách for , while , và do while
    public static void main (String[] args) {
        int n = 10;
        if (n > 1000){
            System.out.println("Nhap lai");
        }
//        for (int i = 2; i <= n; i++){
//            boolean soNguyenTo = true;
//            for (int j = 2; j < i; j++){
//                if (i % j == 0){
//                    soNguyenTo = false;
//                    break;
//                }
//            }
//            if (soNguyenTo == true){
//                System.out.println("So nguyen to tu 0 - n: " + i);
//            }
//        }

//        int i = 2;
//        while (i <= n){
//            boolean soNguyenTo = true;
//            int j = 2;
//            while (j < i){
//                if (i % j == 0){
//                    soNguyenTo = false;
//                    break;
//                }
//                j++;
//            }
//            if(soNguyenTo == true){
//                System.out.println("So nguyen to tu 0 - n: " + i);
//            }
//            i++;
//        }

        int i = 2;
        do{
            boolean soNguyenTo = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
                j++;
            }
            if (soNguyenTo == true) {
                System.out.println("So nguyen to tu 0 - n: " + i);
            }
            i++;
        }while (i <= n);
    }
}
