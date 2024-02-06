//Colton
//This is my second project
//This is for my software program class


public class Count1to100{

    public static void main(String[] args){
     int sum=0;
        for (int x=1; x<101; x++){ //tells how far x needs to go
            sum=sum+x;
            System.out.print(x);
            if (x%2==1){ 
                System.out.println(" odd"); //makes the odd numbers have the word odd after them
            }else{


                System.out.println(" even"); //makes the even numbers have the word even after them
            }


        }
        System.out.println(sum+" is the sum");
        
 }
  



}