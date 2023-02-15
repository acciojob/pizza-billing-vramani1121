package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    boolean ischeeseadded;
    boolean istoppingadded;
    boolean isbillcreated;
    boolean istakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }
        else{
            this.price= 400;
            this.topping = 120;
        }
        this.bill = "Base Price Of The Pizza:"+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!ischeeseadded){
            this.price += 80;
        this.ischeeseadded = true;
    }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istoppingadded){
            this.price +=this.topping;
            istoppingadded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        istakeaway = true;
    }

    public String getBill(){
        // your code goes here
        if(!isbillcreated) {
            if (ischeeseadded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (istoppingadded) {
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            }
            if (istakeaway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isbillcreated = true;


            return this.bill;
        }
        return "";
    }
}
