package com.java.btjava1.btdieukien;

public class btdk3 {
    public static void main(String[] args){
        int soThuc1 = 1;
        int soThuc2 = 2;
        int soThuc3 = 3;
        if(soThuc1<=0 || soThuc2<=0 || soThuc3<=0){
            System.out.println("Khong phai la 3 canh cua tam giac");
        }else if(soThuc1+soThuc2<=soThuc3){
            System.out.println("Khong phai la 3 canh cua tam giac");
        }else{
            System.out.println("La 3 canh cua tam giac");
        }
    }
}
