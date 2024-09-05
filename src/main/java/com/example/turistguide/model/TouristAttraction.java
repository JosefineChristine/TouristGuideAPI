package com.example.turistguide.model;

public class TouristAttraction {

    private String name;
    private String description;

    public TouristAttraction(){
    }

    public TouristAttraction(String name, String discription) {
        this.name = name;
        this.description = discription;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDiscription(){
        return description;
    }

    public void setDiscription(String discription){
        this.description = discription;
    }

    public String toString(){
        return "Name: "         + name +            "\n" +
                "Discription: " + description +     "\n";
    }

}
