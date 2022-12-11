package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isCheeseAdded ;
    private boolean isTakeAway;
    private boolean isToppingAdded;
    private boolean isBillGenerated;
    private String bill ="";
    private int extraCheese_Charge = 80;
    private int takeAway_Charge = 20;
    private int topping_Charge;
    public Pizza(Boolean isVeg){
        this.isBillGenerated = false;
        this.isCheeseAdded = false;
        this.isToppingAdded= false;
        this.isTakeAway = false;
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.topping_Charge = 70;
        }
        else{
            //Non-Veg pizza:
            this.price = 400;
            this.topping_Charge = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isCheeseAdded){
            this.isCheeseAdded = true;
            this.price+=this.extraCheese_Charge;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppingAdded){
            this.isToppingAdded = true;
            this.price += this.topping_Charge;
        }
    }

    public void addTakeaway(){
        if(!this.isTakeAway){
            this.isTakeAway = true;
            this.price+= this.takeAway_Charge;
        }
    }

    public String getBill(){
        if(!this.isBillGenerated) {
            this.isBillGenerated = true;
            if (this.isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.extraCheese_Charge + "\n";
            }
            if (this.isToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.topping_Charge + "\n";
            }
            if (this.isTakeAway) {
                this.bill += "Paperbag Added: " + this.takeAway_Charge + "\n";
            }
            this.bill+="Total Price: "+ this.price +"\n";
        }

        return this.bill;
    }
}
