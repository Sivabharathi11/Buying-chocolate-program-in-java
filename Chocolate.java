package siva;

public class Chocolate {
static int totalchocolate=0;
static int c=0;
	public static void main(String[] args) {
	Chocolate a =new Chocolate();
		int dollar=16;
		int chocolate=a.buychocolate(dollar);
		System.out.println(chocolate);
	}
	private int buychocolate(int dollar) {
		int chocolate1=dollar;//15//5//1
		int cover=chocolate1/3;//5//1//0
		int remaincover=chocolate1%3;//0//2//1
		c=c+remaincover;//0//2//3
		
		totalchocolate+=chocolate1;//15//20//21

		if(cover!=0) { buychocolate(cover);}
		if(c==3||c==4) {
			return totalchocolate+1;
		}
		
		
		return totalchocolate;//22
		
	}

}
