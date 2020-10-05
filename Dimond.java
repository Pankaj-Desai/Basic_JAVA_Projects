import java.util.Scanner;
public class Dimond {

              public static void main(String[] args) {

                           Scanner n = new Scanner(System.in);
                           System.out.println("Enter any length of which you want to display diamond");
                           int number=n.nextInt();
                           int space=number-1;
                           
                           for(int i=1;i<=number;i++)
                           {
                                         for(int j=1;j<=space;j++)
                                         {
                                                       System.out.print(" ");
                                         }
                                         space--;
                                         for(int j=1;j<=2*i-1;j++)
                                         {
                                                       System.out.print("*");
                                         }
                                         System.out.println("");             
                           }
                           
                           space=1;
                           for(int i=1;i<=number;i++)
                           {
                                         for(int j=1;j<=space;j++)
                                         {
                                                       System.out.print(" ");
                                         }
                                         space++;
                                         for(int j=1;j<=2*(number-i)-1;j++)
                                         {
                                                       System.out.print("*");
                                         }
                                         System.out.println("");             
                           }
              }

}


