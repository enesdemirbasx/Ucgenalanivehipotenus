import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a,b,c,sonuc,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgen'in taban kenarını giriniz: ");
        a= input.nextDouble();
        System.out.print("Üçgen'in dik kenarını giriniz: ");
        b= input.nextDouble();
        c=(a*a)+(b*b);
        sonuc=Math.sqrt(c);
        alan=(a*b)/2;
        System.out.println("\nHipotenüs: "+ sonuc);
        System.out.print("Üçgenin alanı: "+ alan);




    }
}