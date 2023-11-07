package com.java.btjava1.btvonglap;

public class btvl1 {
    public static void main(String[] args){
        int n = 10;
        int s = 0;
        if(n<0){
            System.out.println("Nhap lai");
            return;
        }else{
            for(int i=0;i<=n;i++){
                if(i%2==0){
                    s+=i;
                    i++;
                }
            }
        }
        System.out.println("Tong cac so chan: " + s);
    }
}
