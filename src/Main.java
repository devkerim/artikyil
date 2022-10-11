import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int yil,artik;


	System.out.println("Yıl giriniz: ");
	yil = intscanner.nextInt();
	artik = yil%4;
	if(artik==0){System.out.println(yil+" Bir Artık Yıldır!");}
	else{System.out.println(yil+" Bir Artık yıl Değildir!");}

    }
}
