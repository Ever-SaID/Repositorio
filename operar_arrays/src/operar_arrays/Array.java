package operar_arrays;

public class Array {

	public static void main(String[] args) {

		
		int m[]=new int[10];
		int n[]=new int[10];
		rellenar_array(m);
		System.out.println();
		rellenar_array(n);
		System.out.println();
		
		
	}
  //Metodo que rellena  un Array
	public static void rellenar_array(int x[]) {
		int i=0;
		for ( i=0;i<x.length;i++) {
			x[i]=(int)(Math.random()*20+1);
			System.out.print(x[i]+" ");
		}
		
	}
	
	//Metodo que imprima un Array
	
	public static void  imprimir_array(int x[]) {
		int i=0;
		
		for ( i=0;i<x.length;i++) {
			
			System.out.print(x[i]+" ");
		}
				
	}
	

	
}
