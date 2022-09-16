package day2;

public class UseBike {
	public static void main(String[]args) {
		Bike bk=new Bike();
		bk.bikeBrand="Honda";
		bk.bikeColor="Red";
		bk.bikePrice=80000;
		bk.bikeTaxPercentage=30;
		bk.bikeTaxAmount=bk.bikePrice*bk.bikeTaxPercentage/100;
		bk.isTubetyre=true;
		bk.netPrice=bk.bikePrice+bk.bikeTaxPercentage;
		System.out.println(bk.bikeBrand);
		System.out.println(bk.bikeColor);
		System.out.println(bk.bikePrice);
		System.out.println(bk.bikeTaxPercentage);
		System.out.println(bk.isTubetyre);
		System.out.println(bk.netPrice);
		Bike bk1=new Bike();
		bk1.bikeBrand="pulsar";
		bk1.bikeColor="black";
		bk1.bikePrice=85000;
		bk1.bikeTaxPercentage=20;
		bk1.bikeTaxAmount=bk1.bikePrice*bk1.bikeTaxPercentage/100;
		bk1.isTubetyre=false;
		bk1.netPrice=bk1.bikePrice+bk1.bikeTaxAmount;
		System.out.println(bk1.bikeBrand);
		System.out.println(bk1.bikeColor);
		System.out.println(bk1.bikePrice);
		System.out.println(bk1.bikeTaxPercentage);
		
		System.out.println(bk1.isTubetyre);
		System.out.println(bk1.netPrice);
		
		
	}
	

}
