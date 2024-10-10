import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.*;
import java.util.Scanner;

public class programs {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter email : ");
            String email = scanner.nextLine();

            boolean finalResult = isEmailValid(email);
            System.out.println( email + " -> " + finalResult);
        }

        public static boolean isEmailValid(String email)
        {

            boolean result = true;
            if(!(email.contains("@") || email.contains(".")))
            {
                result = false;
            }
            else
            {
                String[] splitEmail = email.split("@");

                if (splitEmail[0] == null || !(splitEmail[1].contains(".")) )
                {
                    result = false;
                }
                else if (splitEmail[1].contains("."))
                {
                    int index = splitEmail[1].indexOf(".");
                    int length = splitEmail[1].length();
                    if(index == 0 || index == length-1)
                        result = false;
                }
            }
            return result;
        }


}




