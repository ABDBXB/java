package oyun;

import java.util.Random;
import java.util.Scanner;
public class ORclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=20,hak=10,sayi,gsayi,secenek,seviye=1,puan=0,defa=0;
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		gsayi=rand.nextInt(20)+1;
			
		do {
					System.out.println(seviye +".level");
		System.out.println("					puaniniz: " + puan);
		System.out.println(a+ "-"+ b + "arasi sayi girinz:" + gsayi);
		sayi=scan.nextInt();
		if(sayi==gsayi) {
			System.out.println("do�ru");
			if(seviye==1) {puan+=1;  gsayi=rand.nextInt(20)+1;}
			if(seviye==2) {puan+=2;  gsayi=rand.nextInt(30)+1;}
			if(seviye==3) {puan+=4;  gsayi=rand.nextInt(40)+1;}
			if(seviye==4) {puan+=8;  gsayi=rand.nextInt(50)+1;}
			if(seviye==5) {puan+=16; gsayi=rand.nextInt(75)+1;}
		}
		else if(sayi>gsayi) {
			System.out.println("sayi kucut" + ",Kalan Hak: " + --hak );
			
		}
		else if(sayi<gsayi) {
			System.out.println("sayi buyutun" +",Kalan Hak: " + --hak );
		}
		if(hak==0) {
			System.out.println("kaybettiniz :( ,Tutulan sayi:" + gsayi);
			for (int i = 0; i < 1; i++) {
			System.out.println("bir daha oynamak ister misiniz? evet=1,hayir=2");
			secenek=scan.nextInt();
			if(secenek==1) {
				hak=10;
				puan=0;
				seviye=1;
				b=20;
			}
			else if(secenek==2) {
				break;
			}
			else {
					System.out.println("yanlis tuslama yaptiniz");
					i-=1;
			}
			}
		}
		if(puan==3 && seviye<2) {seviye+=1;}
		if(seviye==2) {
			if(defa<1) {
				hak=10;
				b+=10;
			System.out.println(seviye + ". seviye'ye hosgeldiniz");
			}
			defa+=1;
		}
		if(puan==9 && seviye<3) {seviye+=1; defa=0;}
		if(seviye==3) {
			if(defa<1) {
				hak=10;
				b+=10;
			System.out.println(seviye + ". seviye'ye hosgeldiniz");
			}
			defa+=1;
		}
		if(puan==21 && seviye<4) {seviye+=1; defa=0;}
		if(seviye==4) {
			if(defa<1) {
				hak=10;
				b+=10;
			System.out.println(seviye + ". seviye'ye hosgeldiniz");
			}
			defa+=1;
		}
		if(puan==45 && seviye<5) {seviye+=1; defa=0;}
		if(seviye==5) {
			if(defa<1) {
				hak=10;
				b+=25;
			System.out.println(seviye + ". seviye'ye hosgeldiniz");
			}
			defa+=1;
		}
		if(puan==93) {
			System.out.println("Tebirkler oyunu bitirdiniz");
			hak=0;//break;
		}
			
		}while(hak>0);
	}

}
