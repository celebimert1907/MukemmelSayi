package Mukemmel;

import java.util.Scanner;

public class MukemmelSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Mukemmel sayi olup olmadigini kontrol etmek icin bir sayi giriniz: ");
        num= input.nextInt();

        int total =0;
        for (int i = 1; i<num; i++){
            if (num % i == 0){
                total = total+i;
                System.out.println(total);
            }
        }
        if(total == num){
            System.out.println("Mukemmel sayidir.");
        } else {
            System.out.println("Mukemmel sayi degildir.");
        }
    }
}
