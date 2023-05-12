package hasierakoariketak;
import java.util.Scanner;
public class kalkulagailua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String izena;
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		
		
		System.out.println("Zein da zure izena?");
		izena = sc.next();
		
		System.out.println("Ongi etorri "+izena+" gure kalkulagailu digitalaren programara. Sartu aldagaiak mesedez");
		
		
		System.out.println("Sartu bi zenbaki");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Lehenengo aldagaia"+a);
		System.out.println("Lehenengo aldagaia"+b);
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
	}

}
