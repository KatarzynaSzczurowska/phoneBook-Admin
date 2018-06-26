package phoneBook;

public class User {

    private String surname;
    private String firstname;
    private int age;
    private String phoneNumber;

    public User(String surname, String firstname, int agefromUser, String phoneNumber) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = agefromUser;
        this.phoneNumber = phoneNumber;
    }

    public String getDescription (boolean isBeaty){
        String dataFromUser = surname + " " + firstname + " " + "wiek: " + age + " lat, " + "tel. " + phoneNumber;
     return dataFromUser;
    }
}



