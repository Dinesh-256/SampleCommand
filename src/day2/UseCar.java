package day2;

public class UseCar {
	public static void main(String[]args) {
		Car cr=new Car();
		cr.carBrand="TOYOTA";
		cr.carColor="WHITE";
		cr.carPrize=120000;
		cr.carTaxAmount=12000;
		cr.isAirBag=true;
		cr.netPrize=cr.carPrize*cr.carTaxAmount;
		System.out.println(cr.carBrand);
		System.out.println(cr.carColor);
		System.out.println(cr.carPrize);
		System.out.println(cr.carTaxAmount);
		System.out.println(cr.isAirBag);
		System.out.println(cr.netPrize);
	
	}

}
