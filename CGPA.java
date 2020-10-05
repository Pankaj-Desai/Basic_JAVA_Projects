import java.util.Scanner;
public class CGPA {
	public static void main(String[] args) {
		System.out.println("Wellcom to CGPA calculator");
		System.out.println("What is your name: ");
		Scanner cc = new Scanner(System.in);
		String answer = cc.nextLine();
		System.out.println("Enter your ID: ");
		int ID = cc.nextInt();
		System.out.println("Enter your marks");
		Scanner input = new Scanner(System.in);
		System.out.print("Maths: ");
		int number =input.nextInt();
		System.out.print("Advance Data Structure: ");
		int number1=input.nextInt();
		System.out.print("Theory of Computation: ");
		int number2=input.nextInt();
		System.out.print("SEPM: ");
		int number3=input.nextInt();
		int ans=(number+number1+number2+number3)/4;
		double CGPA=(ans)/9.5;
		System.out.println("\n\n\n\n******Assignment-I******");
		System.out.println("Student ID: "+ID);
		System.out.println("Student name: "+answer);
		System.out.println("Grade Summary: "+CGPA+"/10");
		System.out.println("Quality of Style: "+CGPA);
		System.out.println("Overall Score: "+CGPA);
		if (CGPA<=3.5789473684210527){
			System.out.println("Comments: FAIL");
		}
		else if (CGPA<=5){
			System.out.println("Comments: POOR");
		}
		else if (CGPA<=7){
			System.out.println("Comments: AVERAGE");
		}
		else if (CGPA<=8.5){
			System.out.println("Comments: GOOD");
		}
		else{
			System.out.println("Comments: VERY GOOD");
		}
	}
}