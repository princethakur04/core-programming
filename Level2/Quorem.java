import java.util.*;
class Quorem{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double num1 = sc.nextDouble();
double num2 = sc.nextDouble();
double Quotient = num1/num2;
double Remainder = num1%num2;
System.out.println("The Quotient is " +Quotient+ " and Reminder is " +Remainder+ " of two number "+num1+ " and " +num2);

}
}