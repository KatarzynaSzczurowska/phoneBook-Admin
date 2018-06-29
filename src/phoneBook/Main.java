package phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int option = 0;
        List<User> userList = new ArrayList<>();
        int id = 1;


        do {
            System.out.println();
            System.out.println( "Klawisz 1 - create new user" );
            System.out.println( "Klawisz 2 - display all users" );
            System.out.println( "Klawisz 3 - program end" );

            option = scanner.nextInt();

            switch (option) {

            }

            if (option == 1) {
                addNewUser( userList, scanner, id++ );
            } else if (option == 2) {
                showAllUsers( userList );
            }

        } while (option != 3);

        System.out.println( "Program end" );
    }


    private static void addNewUser(List<User> userList, Scanner scanner, int id) {
        User user = getUser( scanner, id );
        userList.add( user );
        if (userList.size() == 1) {
            System.out.println( "Userlist contains: " + userList.size() + " user" );
        }
        else
        {
            System.out.println( "Userlist contains: " + userList.size() + " users" );
        }
    }

    private static void showAllUsers(List<User> userList) {

        for (User user : userList) {
            System.out.println( user.getDescription( true ) );
        }
        System.out.println( "Program end" );
    }

    private static User getUser(Scanner scanner, int id) {
        System.out.println( "Retrieve data " );
        System.out.println( "Lastname: " );
        String surname = scanner.next();
        System.out.println( "Firstname: " );
        String firstname = scanner.next();
        System.out.println( "Age: " );
        int usersAge = scanner.nextInt();
        System.out.println( "Phone number: " );
        String usersPhoneNumber = scanner.next();


        User user = new User( surname, firstname, usersAge, usersPhoneNumber, id);
        return user;
    }
}










