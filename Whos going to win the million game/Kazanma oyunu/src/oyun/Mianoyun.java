package oyun;

import java.util.Random;
import java.util.Scanner;


public class Mianoyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Access=0 ,sayac=0,secenek=0,para=0,cekal=0;
		
		String [] cevaplar = new String[10];
		cevaplar[0]= "d";
		cevaplar[1]= "c";
		cevaplar[2]= "b";
		cevaplar[3]= "d";
		cevaplar[4]= "c";
		cevaplar[5]= "d";
		cevaplar[6]= "b";
		cevaplar[7]= "c";
		cevaplar[8]= "a";
		cevaplar[9]= "c";
		
		String [] sorular = new String[10];
		Scanner scan=new Scanner(System.in);
		String HESAP,S�FRE;
		do{
		
		System.out.print("HESAP�N�Z: ");
		HESAP=scan.next();
		if(HESAP .equals("ABD")|| HESAP .equals("Admin") ) {
			System.out.println("Ho�geldiniz: " + HESAP);
			System.out.print("�ifreniz: ");
			S�FRE=scan.next();
			if(S�FRE .equals("admin")) {
				System.out.println("    [[[[<[Oyuna Hosgeldiniz]>]]]]");
				Access=1;
			}
			else {
				System.out.println("You dont have the Access to program sorry :( ");
				Access=0;
			}
		}
		else{
			System.out.println("Boyle bir hesap bulunmad�");
		
		}
		}while(Access==0);
		
		do {
			
			if(sayac==0) {
				 System.out.println((sayac+1)+".Soru");
			System.out.println("fistigi ile meshur ilimiz hangisidir?");
			System.out.println("A:Saliurfa           B:Diyarbakir");
			System.out.println("C:Van                D:Gaziantep");
			}
			if(sayac==1) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("olenin geride biraktigi mal varligina ne denir?");
			System.out.println("A:Senet               B:Borc");
			System.out.println("C:Miras               D:Hazine");
			}
			if (sayac==2) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("Asagidakilerden hangisi istanbul sehir plakasidir?");
			System.out.println("A:37          	   B:34");
			System.out.println("C:35               D:36");
			}
			if (sayac==3) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("A�ag�dakilerden hangisi bir yaz�l�m �e�idi de�ildir?");
			System.out.println("A:��etim sistemleri          	   B:Uygulama yaz�l�mlar�");
			System.out.println("C:Programlama dillleri             D:Yerel Alan A��");	
			}
			if (sayac==4) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("A�a��dakilerden hangisi bir programlama dili de�ildir?");
			System.out.println("A:Pascal               B:Cobol");
			System.out.println("C:Html                 D:Delphi");	
			}
			if (sayac==5) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("A�a��dakilerden hangisi donan�m par�alar�ndan biri de�ildir?");
			System.out.println("A:Klavye               B:Mouse");
			System.out.println("C:Kasa                 D:Windows");	
	
			}
			if (sayac==6) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("Ana belle�in sadece okunabilen, silinemeyen ve de�i�tirilemeyen k�sm�na ne ad verilir?");
			System.out.println("A:RAM Bellek          	  B:ROM Bellek");
			System.out.println("C:Hard Disk               D:CPU");	
			}
			if (sayac==7) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("A�a��dakilerden hangisi hem giri� hem ��k�� birimi de�ildir?");
			System.out.println("A:Modem                B:Bluetooth");
			System.out.println("C:CD Writer            D:Optik Disk");	
			}
			if (sayac==8) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("A�a��dakilerden hangisi fare �e�idi de�ildir?");
			System.out.println("A:Seri                 B:Optik");
			System.out.println("C:PS/2                 D:Multimedia");	
			}
			if (sayac==9) {
				System.out.println((sayac+1)+".Soru");
			System.out.println("K�t�k kullan�m�, kopyalama, disket bi�imlendirme,\nsdisket yede�inin al�nmas� gibi i�lemleri ve program yaz�m \na�amalar�n� kolayla�t�ran program gurubudur. \n�fadesi a�a��dakilerden hangisine aittir?");
			System.out.println("A:�st D�zey Diller                 B:Alt D�zey Diller");
			System.out.println("C:Yard�mc� Programlar              D:Serbest Yaz�l�mlar");	
			}
			
			System.out.print("\nCevap� Giriniz:");sorular[sayac]=scan.next();
			for (int i = 0; i < 1; i++) {
			System.out.println("son cevap mi?, Evet=1 Hayir=0");
			secenek=scan.nextInt();
			if(secenek== 1) {
			if(cevaplar[sayac] .equals(sorular[sayac])) {
				System.out.println("do�ru cevap");
				para+=100;
				if(para==1000) {System.out.println("*****---Tebrikler oyunu bittirdiniz---*****\n"+para+" TL KAZAND�N�Z ;)");break;}
				sayac+=1;
				for (int j = 0; j < 1; j++) {
				System.out.println(para+" TL lik �eki Al Yada yarisa devam et,");
				System.out.println("	Devam Etmek=1 , Ceki Al=2");
				cekal=scan.nextInt();
					if(cekal==1) { secenek=0;}
					else if(cekal==2) {System.out.println("**Tebrikler**  " +para+" TL kazandiniz:) G�r���r�z");}
					else { System.out.println("yanlis tuslama yaptiniz");j-=1;}
				}
			}else {
				System.out.println("Cevap: "+cevaplar[sayac]);
				System.out.println("Yanlis Cevap :/ , g�r���r��");
				break;
			}
			}
			else if(secenek==0) {}
				else {
				System.out.println("yanlis tuslama yaptiniz");
				i-=1;
			}
			}

		}while(secenek==0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
