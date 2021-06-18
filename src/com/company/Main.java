package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yarıçapı giriniz: ");
        int yaricap=input.nextInt();
        System.out.println("Lütfen merkez açı ölçüsünü giriniz: ");
        int aci=input.nextInt();
        //Dairenin Alanı

        double alan=3.14*yaricap*yaricap;
        System.out.println("Dairenin alanı: "+alan);
        //DAirenin Çevresi
        double cevre=3.14*2*yaricap;
        System.out.println("Dairenin çevresi: "+cevre);

        //Daire Diliminin alanı
        double sonuc=(3.14*(yaricap*yaricap)*aci)/360;
        System.out.println("Daire dilimini alanı: "+sonuc);

    }
}
