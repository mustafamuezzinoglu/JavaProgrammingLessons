package day31_Costructors;

public class Pizza {

    public char size;
    public int numberofCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberofCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }

    public double calcCost(){
        double stratingPrice= size=='S' ? 10 : size=='M' ? 12 : 14;
        double totalPrice = stratingPrice+(numberofCheeseTopping+numberOfPepperoniTopping)*2;
        return  totalPrice;
        }

}
/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */