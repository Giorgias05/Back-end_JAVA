package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

		private static int radice;

		public static void main (String[] args)
			{
				System.out.println("This is my first Epicode Java Project!");

			
				int x= 4;
				int y=2;
		
				System.out.println("Es 2/1: " + moltiplica(x,y));
				
		
				String a = "Anno:";
				int b = 2023;
				
				System.out.println("Es 2/2: " + concatena(a,b));
				
				
				
				
				String arr1[]= new String[5];
				arr1[0]= "a";
				arr1[1]= "b";
				arr1[2]= "d";
				arr1[3]= "e";
				arr1[4]= "f";
				
				String add= "c";
				
				String arr2[] = new String [arr1.length +1];
				
				for(int i = 0; i < arr2.length; i++) {
					if(i < 2) {
						arr2[i]= arr1[i];
					} else if(i == 2) {
						arr2[i]= add;
					} else if (i > 2){
						arr2[i]= arr1[i-1];
					}
					System.out.println("elemento arr: " + arr2[i]);
				}

		 
				Scanner sc= new Scanner(System.in);
				System.out.print("Inserisci una STRINGA");
				String s= sc.next();
				
				Scanner sb= new Scanner(System.in);
				System.out.print("Inserisci una STRINGA");
				String t= sb.next();
				
				Scanner sa= new Scanner(System.in);
				System.out.print("Inserisci una STRINGA");
				String p= sa.next();
				
				System.out.println("Es 3: " + s + " " + t + " " + p);
				
		
				double h=1.6;
				double g=5.2;
				
				System.out.println("Es. 4/1: " + perimetroRetangolo(h,g));
				
		
				int num1= 2;
				
				System.out.println("Es. 4/2: " + pariDispari(num1));
				
				int n1= 10;
				int n2= 10;
				int n3= 10;			
				
				System.out.println("Es. 4/3: " + perimetroTriangolo(n1, n2, n3));
				
			}
		

		public static  int moltiplica(int x, int y)
			{
				return x*y;
			}

		public static String concatena(String a, int b) 
			{
				return a+b;
			}


		public static double perimetroRetangolo(double h, double g)
			{
				return (h+g)*2;
			}
		

		public static String pariDispari(int num1)
			{
			float res = num1 % 2;
				if (res == 0){
					return "Pari";
				} else {
					return "Dispari";
				} 
			}
		
	
		public static int perimetroTriangolo(int n1, int n2, int n3) 
			{
				int perimetro = n1+ n2 + n3;
				int res = perimetro * (perimetro - n1) * (perimetro - n2) * (perimetro + n3);
				int r = 0;
				for (int i = 0; i< radice; i++) {
					int radice = res % i;
					if (radice == i) {
						return r= radice;
						}
					}
				return r;
			}
}
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		










