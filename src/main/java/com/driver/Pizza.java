package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isCheeseAdded ;
    private boolean isTakeAway;
    private boolean isToppingAdded;
    private boolean isBillGenerated;
    private String bill;
    private int extraCheese;
    private int takeAway;
    private int topping;
    public Pizza(Boolean isVeg){
        this.isBillGenerated = false;
        this.isCheeseAdded = false;
        this.isToppingAdded= false;
        this.isTakeAway = false;
        this.isVeg = isVeg;
        this.extraCheese = 80;
        this.takeAway = 20;
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }else{
            this.price = 400;
            this.topping = 120;
        }
        this.bill = "Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isCheeseAdded){
            this.isCheeseAdded = true;
            this.price+=this.extraCheese;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppingAdded){
            this.isToppingAdded= true;
            this.price+=this.topping;
        }
    }

    public void addTakeaway(){
        if(!this.isTakeAway){
            this.isTakeAway = true;
            this.price+= this.takeAway;
        }
    }

    public String getBill(){
        if(!this.isBillGenerated) {
            this.isBillGenerated = true;
            if (this.isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.extraCheese + "\n";
            }
            if (this.isToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            }
            if (this.isTakeAway) {
                this.bill += "Paperbag Added: " + this.takeAway + "\n";
            }
            this.bill+="Total Price: "+ this.price +"\n";
        }

        return this.bill;
    }
}