package Flat;

public class Flat {
	// i want change just in local Repository
	// i dont know how ?????
	// i hope that now
	
	int area;
	int flatNum;
	static String address = "stockholm";
	int price = 1000;
	Flat secondFloor ;   // Flat class have reference variable of type Flat
	static int blanketNum = 0;   // static so every change from any object can effect this variable
	boolean isSecondFloor ;
	
	static {
		System.out.println("Welcome to new flats in "+ Flat.address);
	}
	
	public Flat(int area , int flatNum , boolean isSecondFloor ) {
		Flat.blanketNum++ ;
		this.area = area;
		this.flatNum = flatNum;
		this.isSecondFloor = isSecondFloor;
	}
	public Flat(int area) {  // constructor for second floor which take just area 
		this.area = area;
	}
	
	public void checkPrice() {
		if(this.isSecondFloor) {
//			this.secondFloor = new Flat(100);    // important
			System.out.println("the price of flat no: "+ this.flatNum +" is "+ (this.price + 500));
			System.out.println("the total area is: "+(this.area + this.secondFloor.area));
		}else {
			System.out.println("the price of flat no: "+ this.flatNum +" is "+ this.price ) ;
			System.out.println("the total area is: "+this.area );
		}
	}
	public void compareSecondArea(Flat f) {
		if(this.isSecondFloor ) {
			if(this.secondFloor.area > f.secondFloor.area) 
				System.out.println("its bigger.");
			else if(this.secondFloor.area < f.secondFloor.area)
				System.out.println("its smaller.");
			else 
				System.out.println("equals.");
			
	} 
//		else 
//			System.out.println("sorry there is no second floor");
	}
	}
	


