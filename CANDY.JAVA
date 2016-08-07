import java.util.Scanner;

public class Candy{
public static void main(String[] args){
	Scanner scr=new Scanner(System.in);
	int sum=0;
	int prev=1;
	int prev2=1;
	System.out.println("Enter No of Children");
	int number=scr.nextInt();
	System.out.println("Enter Ratings");
	int[] arr=new int[number];
	
	for(int i=0;i<number;i++){
		arr[i]=scr.nextInt();
		
		if(i>0&&arr[i]>arr[i-1]){
			prev=prev+1;
			sum+=prev;
			
		}
		else{
			sum+=prev2;
			prev=1;
	}}
	System.out.println("Minimum Chocolates required : " +sum);
	
}