package web.models;


public class Car {

    private int id;
    private String color;

    private String name;


    public Car(String color, String name, int id) {
        this.color = color;
        this.name = name;
        this.id = id;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}