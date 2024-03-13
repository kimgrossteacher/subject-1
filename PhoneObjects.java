//Colton Dean
//This is my 6th project
//This is for my software program class
public class PhoneObjects {

    public static void main(String[] args){

        Phone phone1=new Phone("PearPhone",2045);//says that phone 1 will be named PearPhone and was made in the year 2045
        Phone phone2=new Phone("StarShoe",1923);
        Phone phone3=new Phone("BrokenApp",3067);
        Phone phone4=new Phone("Iphone4673",2038);
       
            phone1.camersOnThePhone("0");//says that phone 1 has 0 camers
            phone2.camersOnThePhone("6");
            phone3.camersOnThePhone("2");
            phone4.camersOnThePhone("45");
       
            phone1.materialsMadeOutOf("metal");//says that phone 1 is made out metal
            phone2.materialsMadeOutOf("sand");
            phone3.materialsMadeOutOf("broken glass");
            phone4.materialsMadeOutOf("Diamond");

                System.out.println(phone1);//tells to print out phone 1
                System.out.println(phone2);
                System.out.println(phone3);
                System.out.println(phone4);
    }


}
