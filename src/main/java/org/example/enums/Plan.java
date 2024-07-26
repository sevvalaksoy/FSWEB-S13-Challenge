package org.example.enums;

public enum Plan {
    BASIC("basic", 40),
    HARD("hard", 70),
    EASY("easy", 10);

    public String name;
    public int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
