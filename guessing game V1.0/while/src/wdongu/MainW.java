package wdongu;

import java.util.Random;
import java.util.Scanner;

public class MainW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayac=5,sayi,gsayi=50,puan=0,secenek=0,kayip=0;//gsayi: gerek sayi.
		Scanner scan=new Scanner(System.in);
		Random random=new Random();

		
		do {
			puan=0;
			System.out.println("									Puaniniz= " + puan);
			System.out.println("2. levele gecmek icin en az 3 puaniniz kazanmalisiniz");
			sayac=5;
			kayip=0;
			gsayi=random.nextInt(20)+1;
		do {
			
			System.out.println("1-20 arasý tahmininizi giriniz....:" + gsayi);
			sayi=scan.nextInt();
			
			if(sayi==gsayi) {
				puan+=1;
				System.out.println("									Puaniniz= " + puan);
				System.out.println("doðru cevap ;)");
				gsayi=random.nextInt(20)+1;
			}else if(sayi<gsayi) {
				System.out.println("									Puaniniz= " + puan);
				System.out.print("sayiyi buyutun,");
				System.out.println("Kalan Hak: " + --sayac);	
			}else {
				System.out.println("									Puaniniz= " + puan);
				System.out.print("sayiyi kucutun,");
				System.out.println("Kalan Hak: " + --sayac);
			}
			
			if(sayac==0) 
			{System.out.println("uzgunuz kaybettiniz");
			System.out.println("Tutulan syai: " + gsayi);
			System.out.println("									Puaniniz= " + puan);
			kayip=1;
			}
			
		}while(sayac>0 && puan<3);
		
		if(kayip==1) {
		for (int i = 0; i < 1; i++) {
			System.out.println("oyunu bir daha oynamk istermiziniz?");
			System.out.println("bidaha oynamak için 1'ri yada çýkmak için 2 tuslayiniz.");
			secenek=scan.nextInt();
			
				if(secenek==1) {secenek=1;}
				else if(secenek==2) {secenek=2;}
				else {
					i-=1;
					System.out.println("yanlýs deger girdiniz");
				}
			}
		}
		if(puan>=3) {
			System.out.println("ikinci levelegectiniz tebrikler ;) ");
			kayip=0;
			secenek=3;
		}
		
		}while(secenek==1);
		
		
		
		
		
		
		
		
		//                              2.level
		
		if(secenek==3) {
			System.out.println("				2. levele Hosgeldiniz");
			System.out.println("			her yanlis cevap bir puan kiralacak ;) ");
			do {
				if(kayip==1)  {puan=0;}
				System.out.println("									Puaniniz= " + puan);
				System.out.println("3. levele gecmek icin en az 9 puaniniz kazanmalisiniz");
				sayac=5;
				kayip=0;
				gsayi=random.nextInt(30)+1;
			do {
				System.out.println("1-30 arasý tahmininizi giriniz....:" + gsayi);
				sayi=scan.nextInt();
				if(sayi==gsayi) {
					puan+=2;
					System.out.println("								Puaniniz= " + puan);
					System.out.println("doðru cevap ;)");
					gsayi=random.nextInt(30)+1;
				}else if(sayi<gsayi) {
					puan-=1;
					System.out.print("yanlis maalesef bir puan kaybettiniz");
					System.out.println("						Puaniniz= " + puan);
					System.out.print("sayiyi buyutun,");
					System.out.println("Kalan Hak: " + --sayac);	
				}else {
					puan-=1;
					System.out.print("yanlis maalesef bir puan kaybettiniz");
					System.out.println("						Puaniniz= " + puan);
					System.out.print("sayiyi kucutun,");
					System.out.println("Kalan Hak: " + --sayac);
				}
				
				if(sayac==0) 
				{
				System.out.println("uzgunuz kaybettiniz");
				System.out.println("Tutulan syai: " + gsayi);
				System.out.println("									Puaniniz= " + puan);
				kayip=1;
				}
				
			}while(sayac>0 && puan<9);
			if(kayip==1) {
				for (int i = 0; i < 1; i++) {
					System.out.println("oyunu bir daha oynamk istermiziniz?");
					System.out.println("bidaha oynamak için 1'ri yada çýkmak için 2 tuslayiniz.");
					secenek=scan.nextInt();
					
						if(secenek==1) {secenek=1;kayip=1;}
						else if(secenek==2) {secenek=2;}
						else {
							i-=1;
							System.out.println("yanlýs deger girdiniz");
						}
					}
				}
				if(puan>=9) {
					System.out.println("ucuncu levelegectiniz tebrikler ;) ");
					secenek=3;
					kayip=0;
				}
			
			}while(secenek==1);
			
			
			
			
			
			
			
			//                          3.level
			if(secenek==3) {
				System.out.println("				3. levele Hosgeldiniz");
				System.out.println("			her yanlis cevap bir puan kiralacak ;) ");
				do {
					if(kayip==1)  {puan=0;}
					System.out.println("									Puaniniz= " + puan);
					System.out.println("4. levele gecmek icin en az 20 puaniniz kazanmalisiniz");
					sayac=5;
					kayip=0;
					gsayi=random.nextInt(40)+1;
				do {
					System.out.println("1-40 arasý tahmininizi giriniz....:" + gsayi);
					sayi=scan.nextInt();
					if(sayi==gsayi) {
						puan+=4;
						System.out.println("								Puaniniz= " + puan);
						System.out.println("doðru cevap ;)");
						gsayi=random.nextInt(40)+1;
					}else if(sayi<gsayi) {
						puan-=1;
						System.out.print("yanlis maalesef bir puan kaybettiniz");
						System.out.println("						Puaniniz= " + puan);
						System.out.print("sayiyi buyutun,");
						System.out.println("Kalan Hak: " + --sayac);	
					}else {
						puan-=1;
						System.out.print("yanlis maalesef bir puan kaybettiniz");
						System.out.println("						Puaniniz= " + puan);
						System.out.print("sayiyi kucutun,");
						System.out.println("Kalan Hak: " + --sayac);
					}
					
					if(sayac==0) 
					{
					System.out.println("uzgunuz kaybettiniz");
					System.out.println("Tutulan syai: " + gsayi);
					System.out.println("									Puaniniz= " + puan);
					kayip=1;
					}
					
				}while(sayac>0 && puan<20);
				
				if(kayip==1) {
					for (int i = 0; i < 1; i++) {
						System.out.println("oyunu bir daha oynamk istermiziniz?");
						System.out.println("bidaha oynamak için 1'ri yada çýkmak için 2 tuslayiniz.");
						secenek=scan.nextInt();
						
							if(secenek==1) {secenek=1;}
							else if(secenek==2) {secenek=2;}
							else {
								i-=1;
								System.out.println("yanlýs deger girdiniz");
							}
						}
					}
					if(puan>=20) {
						System.out.println("dorduncu levelegectiniz tebrikler ;) ");
						secenek=3;
						kayip=0;
					}
				
				}while(secenek==1);
				
				
				
				
				
				
				
				
				
				
				
				
				//                            4.level
				if(secenek==3) {
					System.out.println("				4. levele Hosgeldiniz");
					System.out.println("			her yanklis cevap bir puan kiralacak ;) ");
					do {
						if(kayip==1)  {puan=0;}
						System.out.println("									Puaniniz= " + puan);
						System.out.println("5. levele gecmek icin en az 35 puaniniz kazanmalisiniz");
						sayac=5;
						kayip=0;
						gsayi=random.nextInt(50)+1;
					do {
						System.out.println("1-50 arasý tahmininizi giriniz....:" + gsayi);
						sayi=scan.nextInt();
						if(sayi==gsayi) {
							puan+=8;
							System.out.println("								Puaniniz= " + puan);
							System.out.println("doðru cevap ;)");
							gsayi=random.nextInt(50)+1;
						}else if(sayi<gsayi) {
							puan-=1;
							System.out.print("yanlis maalesef bir puan kaybettiniz");
							System.out.println("						Puaniniz= " + puan);
							System.out.print("sayiyi buyutun,");
							System.out.println("Kalan Hak: " + --sayac);	
						}else {
							puan-=1;
							System.out.print("yanlis maalesef bir puan kaybettiniz");
							System.out.println("						Puaniniz= " + puan);
							System.out.print("sayiyi kucutun,");
							System.out.println("Kalan Hak: " + --sayac);
						}
						
						if(sayac==0) 
						{
						System.out.println("uzgunuz kaybettiniz");
						System.out.println("Tutulan syai: " + gsayi);
						System.out.println("									Puaniniz= " + puan);
						kayip=1;
						}
						
					}while(sayac>0 && puan<35);
					
					if(kayip==1) {
						for (int i = 0; i < 1; i++) {
							System.out.println("oyunu bir daha oynamk istermiziniz?");
							System.out.println("bidaha oynamak için 1'ri yada çýkmak için 2 tuslayiniz.");
							secenek=scan.nextInt();
							
								if(secenek==1) {secenek=1;}
								else if(secenek==2) {secenek=2;}
								else {
									i-=1;
									System.out.println("yanlýs deger girdiniz");
								}
							}
						}
						if(puan>=35) {
							System.out.println("besinci levelegectiniz tebrikler ;) ");
							secenek=3;
							kayip=0;
						}
					
					}while(secenek==1);
					
					
					
					
					
					
					
					
					
					//                        5.level
					if(secenek==3) {
						System.out.println("				5. levele Hosgeldiniz Son level");
						System.out.println("			her yanlis cevap bir puan kiralacak ;) ");
						do {
							if(kayip==1)  {puan=0;}
							System.out.println("									Puaniniz= " + puan);
							System.out.println("						Son Lecel ;) 45puan kazanin ");
							sayac=5;
							kayip=0;
							gsayi=random.nextInt(70)+1;
						do {
							System.out.println("1-75 arasý tahmininizi giriniz....:" + gsayi);
							sayi=scan.nextInt();
							if(sayi==gsayi) {
								puan+=16;
								System.out.println("								Puaniniz= " + puan);
								System.out.println("doðru cevap ;)");
								gsayi=random.nextInt(70)+1;
							}else if(sayi<gsayi) {
								puan-=1;
								System.out.print("yanlis maalesef iki puan kaybettiniz");
								System.out.println("						Puaniniz= " + puan);
								System.out.print("sayiyi buyutun,");
								System.out.println("Kalan Hak: " + --sayac);	
							}else {
								puan-=1;
								System.out.print("yanlis maalesef iki puan kaybettiniz");
								System.out.println("						Puaniniz= " + puan);
								System.out.print("sayiyi kucutun,");
								System.out.println("Kalan Hak: " + --sayac);
							}
							
							if(sayac==0) 
							{
							System.out.println("uzgunuz kaybettiniz");
							System.out.println("Tutulan syai: " + gsayi);
							System.out.println("									Puaniniz= " + puan);
							kayip=1;
							}
							if(puan>=45 && kayip==0) {
								System.out.println("oyunu bitirdiniz tebrikler :)");
								secenek=2;
								break;
							}
						}while(sayac>0);
						
						if(kayip==1) {
							for (int i = 0; i < 1; i++) {
								System.out.println("oyunu bir daha oynamk istermiziniz?");
								System.out.println("bidaha oynamak için 1'ri yada çýkmak için 2 tuslayiniz.");
								secenek=scan.nextInt();
								
									if(secenek==1) {secenek=1;}
									else if(secenek==2) {secenek=2;}
									else {
										i-=1;
										System.out.println("yanlýs deger girdiniz");
									}
								}
							}
						
							
						}while(secenek==1);
			
			
			
		}
		
	}
}
	
		}
	}
}


