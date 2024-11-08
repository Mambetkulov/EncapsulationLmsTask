public class Car {
    private String name;
    private String model;
    private String color;
    private final String[] car = new String[3];

    public String[] getCar(){
        return car;
    }


    public void setName (String name){
        this.name = name;
        car[0] = this.name;

    }

    public void setModel (String model){
        this.model = model;
        car[1] = this.model;

    }


    public void setColor (String color) {
        this.color = color;
        car[2] = this.color;
    }





}

