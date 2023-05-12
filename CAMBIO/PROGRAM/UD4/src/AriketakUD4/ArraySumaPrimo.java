package AriketakUD4;

import java.util.Scanner;

public class ArraySumaPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] c = new int[10];
		
		int a=0,i=0,n=0,total=0,kont=0;
		
			
		while ((n>=0) && (i<c.length)) {
			
			System.out.println("Sartu tenperatura balore bat");
			n = sc.nextInt();
			
			if (n>=0) {
				c[i]=n;
				total = total+c[i];
				i++;
			}
		}
		if (i>0) {
			System.out.println(total);
			
			for(int j = 1; j <= total; j++)
	        {
	            if((total % j) == 0)
	            {
	                kont++;
	            }
	        }
	 
	        if(kont <= 2) {
	        	System.out.println("Zenbakia lehena da");
	        }
	        else {
	        	System.out.println("Zenbakia ez da lehena");
	        }
		}
		else {
			System.out.println("ERROR");
		}
	}

}
