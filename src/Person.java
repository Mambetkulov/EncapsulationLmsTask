public class Person {
    private String name;
    private String surname;
    private String age;
    private final String[] person = new String[3];


    public String[] getPerson(){
        return person;
    }


    public void setName (String name){
        this.name = name;
        person[0] = this.name;
    }


    public void setSurname (String surname){
        this.surname = surname;
        person[1] = this.surname;
    }


    public void setAge (String age){
        this.age = age;
        person[2] = this.age;
    }


}
