import java.util.*;
class UniversityFee{
public static void main(String[] args){
int fee = 125000;
int DiscountPercent = 10;
int DiscountedAmount = (fee*DiscountPercent)/100;
int DiscountedPrice = fee - DiscountedAmount;
System.out.println(" Discounted Amount  is  " + DiscountedAmount +  " and Discounted Price is " + DiscountedPrice);
}
}