import java.util.Random;
public class Yeet{
    public static void main (String [] args){
    
    Random ran = new Random();
    
    int num1 = ran.nextInt(100);
    int num2 = ran.nextInt(100);
    
    System.out.println("The first number is: " + num1);
    System.out.println("The second number is: " + num2);
    
    System.out.println("The maximum number is " + Math.max(num1, num2));
    
    
    }
}