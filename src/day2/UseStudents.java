package day2;

public class UseStudents {
	public static void main(String[]args) {
		Students std=new Students();
		std.studentName="Dinesh";
		std.studentRollNo=3546253l;
		std.mathsMark=70;
		std.englishMark=80;
		std.physicsMark=75;
		std.chemistryMark=67;
		std.biologyMark=70;
		std.tamilMark=74;
		std.total=std.mathsMark+std.englishMark+std.physicsMark+std.chemistryMark+std.biologyMark+std.tamilMark;
		std.avarage=std.total/6;
		System.out.println("Student Name="+ std.studentName);
		System.out.println("Roll Number= "+std.studentRollNo);
		System.out.println("Maths "+std.mathsMark);
		System.out.println("English "+std.englishMark);
		System.out.println("Physics "+std.physicsMark);
		System.out.println("Chemistry "+std.chemistryMark);
		System.out.println("Biology "+std.biologyMark);
		System.out.println("Tamil "+std.tamilMark);
		System.out.println("Total "+std.total);
		System.out.println("Avarage "+std.avarage);
	}

}
