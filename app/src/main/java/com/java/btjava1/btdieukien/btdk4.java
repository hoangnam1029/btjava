package com.java.btjava1.btdieukien;

public class btdk4 {
    public static void main(String[] args){
        int so1 = 3;
        int so2 = 4;
        int so3 = 5;
        if(so1<=0 || so2<=0 || so3<=0){
            System.out.println("Khong phai la 3 canh cua tam giac");
        } else if (so1 * so1 + so2 * so2 == so3 * so3) {
            System.out.println("La 3 canh cua tam giac vuong");
        }else {
            System.out.println("Khong phai la 3 canh cua tam giac vuong");
        }
    }
}
