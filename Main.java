package Flat;
public class Main {

	public static void main(String[] args) {
		Flat f1 = new Flat(100 , 10 , true);
		Flat f2 = new Flat(170 , 11 , true);
		Flat f3 = new Flat(150 , 12 , false);
		f2.secondFloor = new Flat(200);    
		f1.secondFloor = new Flat(150);
//		System.out.println(f1.secondFloor.area);
//		System.out.println(f2.secondFloor.area);
//		System.out.println(f3.secondFloor.area);
//		f1.checkPrice();
		f3.checkPrice();
//		System.out.println();
//		f2.checkPrice();
//		
		f1.compareSecondArea(f2);
		
		

	}

}
