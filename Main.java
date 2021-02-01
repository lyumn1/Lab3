import  java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to count down or up from:");
		String a = input.nextLine();
		int b = Integer.parseInt(a);
		if(b>0){
			int i= b;
			while(i>=0){
				if(i>0){
					System.out.println(i);
					i--;
					
				}else{
					System.out.println(i);
					System.out.println("Blast off");
					i--;
				}
			}
		}else if(b<0){
			int i= b;
			while(i<=0){
				if(i<0){
					System.out.println(i);
					i++;
				}else{
					System.out.println(i);
					System.out.println("Blast off");
					i++;
				}
        				
			}
		}else{
			System.out.println("wrong number！");
		}
	}
}
