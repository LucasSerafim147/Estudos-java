package MANOS;

public class trocarVariavel {
	public static void main(String[] args) {
	String x = "Agua";
	String y = " Suco";
	String Temp;
	
	Temp= x;
	x=y;
	y=Temp;
	
	
	System.out.println("X é "+ x);
	System.out.println("Y é "+ y);
}
}
