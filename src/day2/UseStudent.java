package day2;

public class UseStudent {
	public static void main(String[]args) {
		Student std=new Student();
		std.name="siva";
		std.id=234;
		std.age=14;
		std.clas="IX";
		std.attandancePercentage=75;
		std.numberOfTheDayPresentinSchool=240*std.attandancePercentage/100;
		System.out.println(std.name);
		System.out.println(std.id);
		System.out.println(std.age);
		System.out.println(std.clas);
		System.out.println(std.attandancePercentage);
		System.out.println(std.numberOfTheDayPresentinSchool);
		
		Student std1=new Student();
		std1.name="mani";
		std1.id=236;
		std1.age=15;
		std1.clas="x";
		std1.attandancePercentage=80;
		std1.numberOfTheDayPresentinSchool=240*std1.attandancePercentage/100;
		System.out.println(std1.name);
		System.out.println(std1.id);
		System.out.println(std1.age);
		System.out.println(std1.clas);
		System.out.println(std1.attandancePercentage);
		System.out.println(std1.numberOfTheDayPresentinSchool);
		
		Student std2=new Student();
		std2.name="Valli";
		std2.id=237;
		std2.age=13;
		std2.clas="VIII";
		std2.attandancePercentage=90;
		std2.numberOfTheDayPresentinSchool=240*std2.attandancePercentage/100;
		System.out.println(std2.name);
		System.out.println(std2.id);
		System.out.println(std2.age);
		System.out.println(std2.clas);
		System.out.println(std2.attandancePercentage);
		System.out.println(std2.numberOfTheDayPresentinSchool);
		
	}

}
