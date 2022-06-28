import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, toplam = 0, n = 0;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen bir tam sayi giriniz: ");
		num = deger.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				n++;
			}
		}
		System.out.print("ortalama: "+toplam/n);
	}

}
