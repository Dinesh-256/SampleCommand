package day2;

public class UsePencil {
	public static void main(String[]args) {
		Pencil pn=new Pencil();
		pn.pencilBrand="NATARAJ";
		pn.color="black";
		pn.length=3.1f;
		pn.price=20;
		pn.isTipPencil=true;
		pn.quality="good";
		System.out.println("The Pencil Brand="+pn.pencilBrand);
		System.out.println("The Pencil Color="+pn.color);
		System.out.println("Pencil Length=" +pn.length);
		System.out.println("Pencil Price= "+pn.price);
		System.out.println("Is Tip Pencil= "+pn.isTipPencil);
		System.out.println("Pencil Quality= "+pn.quality);
		
		
		
		
	}

}
