public class University {
    private String name;
    private String location;
    private String headmaster;
    private  final String[] uni = new String[3] ;


    public String[] getUni(){
        return uni;
    }


    public void setName (String name){
        this.name = name;
        uni[0] = this.name;
    }

    public void setLocation (String location){
        this.location = location;
        uni[1] = this.location;
    }

    public void setHeadmaster (String headmaster){
        this.headmaster = headmaster;
        uni[2] = this.headmaster;

    }




}
