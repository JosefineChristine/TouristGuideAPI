package com.example.turistguide.model;

public class TouristAttraction {

    private String name;
    private String discription;

    public TouristAttraction(){
    }

    public TouristAttraction(String name, String discription) {
        this.name = name;
        this.discription = discription;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDiscription(){
        return discription;
    }

    public void setDiscription(String discription){
        this.discription = discription;
    }

    public String toString(){
        return "Name: "         + name +            "\n" +
                "Discription: " + discription +     "\n";
    }

}
