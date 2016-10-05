
package mathmethod;

import java.util.Scanner;

/**
 *
 * @author Kent Huang
 * 2016.10.4
 * explore math method!
 */
public class MathMethod {

    
    /**the function checks if the user wants to exit
     * if the input is 1, then continue 
     * if the input is 2, quit the current interface
     * @param a user input
     * @return boolean value that if the user wants to exit 
     */
    public static boolean exitCheck(int a){
        //check if the user input is valid
        try{
            //if user input is 1 return 2, otherwise return false
            if(a==1){
                return true;
            }else if(a==2){
                return false;
            }else{
                //if input is not 1 or 2, return false
                System.out.println("false input,return to menu");
                return false;
            }
        //if input is not integer, return false
        }catch(Exception e){
            System.out.println("false input,return to menu");
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //c is used for user selection
        //a,b,x,y are values for calculation in the program
        int c,a,b;
        double x,y;
        Scanner sc=new Scanner(System.in);
        //boolean value to check if the user wants to exit
        boolean t=true;
        //do-while loop for the menu, it goes back if the user input is not exit
        do{
            //catch any exceptions
            try{
                System.out.println("Which math method would you explore?\n1.decrementExact(int a)\n2.hypot(double x,double y)\n3.toDegrees(double angrad)\n4.cbrt(double a)\n5.floorDiv(int x, int y)\n6.exit");
                //read input
                c=sc.nextInt();
                //different functions for different user selection
                switch(c){
                    case 1:
                        //boolean value to check if the user wants to exit
                        boolean t1;
                        //introduce the method
                        System.out.println("Returns the argument decremented by one, throwing an exception if the result overflows an int.\nFor example, decrementExact(3) returns 2\ninput an integer and see what the method returns");
                        //do-while loop that goes back if the user wants to keep trying the method
                        do{
                            //read the value for this math method
                            a=sc.nextInt();
                            System.out.println("The method returns"+Math.decrementExact(a)+"\ntry again?\n1.yes\n2.no");
                            //read exit input from user
                            a=sc.nextInt();
                            //check if the user wants to exit
                            t1=exitCheck(a);
                        }while(t1);
                        break;
                    case 2:
                        boolean t2;
                            System.out.println("Returns sqrt(x^2+y^2) without intermediate overflow or underflow.");
                            System.out.println("For example, hypot(3,4) returns 5 because sqrt(3*3+4*4)=5\ninput two numbers and see what the method returns");
                        do{
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            System.out.println("The method returns"+Math.hypot(x,y)+"\ntry again?\n1.yes\n2.no");
                            a=sc.nextInt();
                            t2=exitCheck(a);
                        }while(t2);
                        break;
                    case 3:
                        boolean t3;
                            System.out.println("Converts an angle measured in radians to an approximately equivalent angle measured in degrees");
                            System.out.println("For example, toDegrees(pi/2) returns 90\ninput a numbers and see what the method returns");
                        do{
                            x=sc.nextDouble();
                            System.out.println("The method returns"+Math.toDegrees(x)+"\ntry again?\n1.yes\n2.no");
                            a=sc.nextInt();
                            t3=exitCheck(a);
                        }while(t3);
                        break;
                    case 4:
                        boolean t4;
                            System.out.println("Returns the cube root of a double value");
                            System.out.println("For example, cbrt(27) returns 3\ninput a numbers and see what the method returns");
                        do{
                            x=sc.nextDouble();
                            System.out.println("The method returns"+Math.cbrt(x)+"\ntry again?\n1.yes\n2.no");
                            a=sc.nextInt();
                            t4=exitCheck(a);
                        }while(t4);
                        break;
                    case 5:
                        boolean t5;
                            System.out.println("Returns the largest int value that is less than or equal to the algebraic quotient.");
                            System.out.println("For example, floorDiv(7,2) returns 3\ninput two integers and see what the method returns");
                        do{
                            a=sc.nextInt();
                            b=sc.nextInt();
                            System.out.println("The method returns"+Math.floorDiv(a,b)+"\ntry again?\n1.yes\n2.no");
                            a=sc.nextInt();
                            t5=exitCheck(a);
                        }while(t5);
                        break;
                    case 6:
                        //exit if user chooses exit
                        t=false;
                        break;
                    default:
                        break;
                }
            //reset the loop if the input is invalid
            }catch(Exception e){
                System.out.println("false input,return to menu");
                t=true;
            }
        }while(t);
    }
}
