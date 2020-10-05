import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		 System.out.println("Enter the radius of the circle: ");
		 Scanner input= new Scanner (System.in);
		 double number = input.nextDouble();
		 System.out.println("What do you want to calculate: ");
		 System.out.print("1)Diameter\n2)Circumference\n3)Area");
		 int option = input.nextInt();
			 switch(option){
			 case 1:
				 double diameter = 2*number;
				 System.out.println("Hence the radius is: "+ diameter);
				 break;
			 case 2:
				 double circumference = 2*3.14*number;
				 System.out.println("Hence the Circumferenfe is: "+circumference);
				 break;
			 case 3:
				 double area = 3.14*number*number;
				 System.out.println("Hence the area while be "+area);
				 break;
			 }
	}
}