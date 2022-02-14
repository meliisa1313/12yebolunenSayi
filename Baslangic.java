package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        //Ödev
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int sayi,toplam=0,sayac=0,ortalama;
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        sayi=input.nextInt();
        for(int i=1;i<sayi;i++) {
           if(i %12 ==0){
               System.out.println(i);
               toplam=toplam+i;
               sayac++;

           }}
           ortalama=toplam/sayac;
            System.out.println(ortalama);




        }


        }




