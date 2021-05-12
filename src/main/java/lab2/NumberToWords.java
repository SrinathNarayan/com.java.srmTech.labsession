package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberToWords {
	static Logger log = Logger.getLogger(NumberToWords.class.getName());
	 public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
log.info("enter the number");
	        int n=sc.nextInt();
	        int n1=n,n2=n;
	        int b=n1%10,a=n2/10; //  n1/10 means last digit is removed and n2%10 means last digit by modulus
	 
	        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
	        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
	        String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
	        if(a==1)
	        {
	           log.info(two_digits[b+1]);
	        }
	        else if(b==0)
	           log.info(tens_multiple[a]);
	        else
	           log.info(tens_multiple[a]+"-"+single_digits[b]);
				sc.close();
			 }

}
