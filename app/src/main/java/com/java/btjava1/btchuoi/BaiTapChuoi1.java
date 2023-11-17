package com.java.btjava1.btchuoi;

public class BaiTapChuoi1 {

    /*
    *
    * Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
    * */
    //chuoi1 =  abcxyz   => n = a

    public static void main(String[] args){
       // chuoi
        String chuoi = "abcxyz";
        char[] list = chuoi.toCharArray();

        //ky tu
        char kytu= 'q';
        boolean coXuatHien =false;

        for (int i = 0; i <list.length ; i++) {
            if(kytu == list[i])
            {
                coXuatHien =true;
                break;
            }
        }

        if(coXuatHien){
            System.out.println("Có");
        }else{
            System.out.println("Không");
        }







    }
}
