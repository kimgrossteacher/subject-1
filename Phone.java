//Colton Dean
//This is my 6th project
//This is for my software program class
public class Phone {

    String name;//name of phone
    int yearMade;//year the phonw as made
   String howManyCamers="I dont know";//how many camers there are
   String materialsUsed="idk";//what material was used
   public Phone(String phoneBrand, int year){ 
        name=phoneBrand; 
        yearMade=year; 
    };
    public String toString (){
        return name+" was made in "+yearMade+" camers on the phone "+howManyCamers+" This phone was made with "+materialsUsed; //tells when I put in the words that are blue the text before it will print out
    };    
    public void camersOnThePhone(String camers){//
        howManyCamers=camers;
    }
    public void materialsMadeOutOf(String materials){
        materialsUsed=materials;
    }

}










