//Colton Dean
//This is for my software program class
//This is my 6th project

public class Createsomeobjects {

    public static void main(String[] args){
        Horse horse1=new Horse("Jeff",1996);//This says that horse one will be named jeff and was born in 1996
        Horse horse2=new Horse("David",2002);
        Horse horse3=new Horse("lesa",1973);
        Horse horse4=horse1;//this tells that horse 4 is the same as horse 1
        horse4.setFavoriteThing("sleepy");   // sets horse 1 and horse 4 to have sleepy as there favorite thing
            
            System.out.println(horse1);//prints out the horses names and the year they where born and there favorite thing
            System.out.println(horse2);
            System.out.println(horse3);
            System.out.println(horse4);

}


}