//Colton Dean
//This is for my program and software class


public class Main {


first_name = input(" Colton ")
last_name = input(" Dean ")
year = input(" 11th Juner ")
school_name = input(" IHLA ") 

// Open the file in write mode, will create it if it doesn't exist
with open(" student.txt", "w") as file:

    file.write(first_name + "\n")  // Write first name on the first line
    file.write(last_name + "\n")   // Write last name on the second line
    file.write(year + "\n")         // Write year on the third line
    file.write(school_name + "\n")  // Write school name on the fourth line

// Step 3: Confirming that the information has been saved
print("Your information has been saved to student.txt.")


}
