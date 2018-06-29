package phoneBook;

public class User {

    private String surname;
    private String firstname;
    private int age;
    private String phoneNumber;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public User(String surname, String firstname, int age, String phoneNumber, int id) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getDescription (boolean isBeaty){
        String dataFromUser ="id: "+ id +" "+ surname + " " + firstname + " " + "wiek: " + age + " lat, " + "tel. " + phoneNumber;
     return dataFromUser;
    }
}



