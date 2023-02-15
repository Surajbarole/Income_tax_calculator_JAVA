import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int income=sc.nextInt();
		int tax=0;
		if(income<=500000){
		    tax= 0;
		}else if(income>=500000 && income<=1000000){
		    tax=(int) (income*0.2);
		}else if(income<=1000000 && income>=18000000){
		     tax=(int) (income*0.3);
		}else {
		     tax=(int) (income*0.5);
		}
		System.out.println("Your Income tax is " + tax);
	}
}