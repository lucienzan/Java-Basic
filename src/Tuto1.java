import java.util.Scanner;

public class Tuto1 {
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	
        //Printf
    	String greet = "This is daniel";
    	double myMoney = 1000.34000;
    	char sign = '$';
    	int age = 23;
    	
    	// for string use s
    	System.out.printf("%s",greet);
    	scanner.nextLine();

    	// for int use "d"
    	System.out.printf("I am %d years old",age);
    	scanner.nextLine();
    	
    	String message = String.format("I have %.2f %s", myMoney,sign);
    	System.out.println(message);
    	scanner.nextLine();
    	
    	System.out.printf("%014f",myMoney); // 0001000.340000
    	scanner.nextLine();
    	
    	System.out.printf("%,.2f",myMoney); // 1,000.34
    	scanner.close();
    }
}
