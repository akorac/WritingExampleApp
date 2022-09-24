import java.io.*;
import java.io.IOException;
import java.util.Scanner;


public class WritingExampleApp
{
    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        String age;              // prompt user for first and last name, and age
        String moreDetails = "yes";

        Scanner keyboard = new Scanner(System.in);

        try
        {
            File file = new File("names.csv");
            boolean created = file.createNewFile();

            if(created)
            {
                System.out.println(file.getName() + " created");
            }

            while(moreDetails.equalsIgnoreCase("yes")) {
                System.out.println("First name: ");
                firstName = keyboard.nextLine();

                System.out.println("Last name: ");
                lastName = keyboard.nextLine();

                System.out.println("Age: ");
                age = keyboard.nextLine();
                Integer.parseInt(age);

                WritingExample we = new WritingExample(file);
                we.writeToFile(firstName, lastName, Integer.parseInt(age));

                System.out.println("Do you want to add more data? Type yes or no");
                moreDetails = keyboard.nextLine();


            }

        }
        catch(IOException ioe)
        {
            System.out.println("Error with the file");
        }


    }
}