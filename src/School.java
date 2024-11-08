public class School {
    private String name;
    private String headmaster ;
    private String number;
    private final String[] scl = new String [3];



    public String[] getScl(){
        return scl;
    }


    public void setName (String name){
        this.name = name;
        scl[0] = this.name;

    }

    public void setHeadmaster (String headmaster){
        this.headmaster = headmaster;
        scl[1] = this.headmaster;

    }


    public void setNumber (String number){
        this.number = number;
        scl[2] = this.number;

    }





}
