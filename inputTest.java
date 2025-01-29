import java.util.Scanner;

public class inputTest {
    public static void main(String[] args){
        



    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);       
    
    System.out.println("What is your age");
    try{
    int age=myObj.nextInt();
    }
    catch(exception e){
        System.out.println(" you age needs to be a whole number please"):
    }
    System.out.println("My age is "+age);
  }
}

    

