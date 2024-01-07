package giris;



import java.util.Scanner;

public class Giris {
	
	static boolean basarili = true;
	
	static String id;
	
	static String sifre;
	
	static int girisHakki = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (girisHakki<=3) {
			
			System.out.println("kullanıcı adı : ");
			
			id = scanner.next();
			
			System.out.println("şifre : ");
			
			sifre = scanner.next();
			
			if (id == ("elvin") && sifre == ("123")) {
				
				System.out.println("giriş yapıldı");
				break;
				
			}
			
			if (!(id == ("elvin")) || !(sifre == ("123"))) {
				System.out.println("giriş yapılmadı");
			
			    girisHakki--;
			    }
			
			else {
				System.out.println("giriş hakkınız bitti");
				
			}
			
		}
		
		
		
		

	}
	
	
			
			
			
			
			
			
			
		
		
	}
	


