
import java.util.Scanner;
class CoffeeMachine1{
    static Scanner scan = new Scanner(System.in);
    private double coffee_powd, mlk, wat;
    private int Coffee_Count = 0;
    public CoffeeMachine1 (){
        this.coffee_powd=0; //powd stangs for a powder
        this.mlk=0; //mlk stands for milk
        this.wat=0; // wat stands for water
    }
    private void SetIngredient(){
        System.out.println("\nFilling...");
        this.coffee_powd = 500.0;
        this.mlk = 1;
        this.wat= 2;
        System.out.println("Filling Completed.");
    }
    private void GetIngredient(){
        System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
        System.out.println("Available Milk(Liter) "+String.format("%.1f", this.mlk));
        System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
    }
    private void CleanMachine(){
        System.out.println("\nCleaning Machine...");
        this.coffee_powd = 0;
        this.mlk = 0;
        this.wat= 0;
        System.out.println("Cleaning Completed.");
    }
    private void makecoffee(){
        System.out.println("\n  ");
        System.out.println("|   Select Type:   |\n  \n| 1:  Black Coffee |\n| 2:  Milk Coffee  |\n| 0   to Discard   |");
        System.out.println(" \n");
        char t = scan.next().charAt(0);
        switch(t){
            case '1':
                this.BlackCoffee();
                break;
            case '2':
                this.MilkCoffee();
                break;
            case '0':
                break;
        }
    }
    private void BlackCoffee(){
        if(this.coffee_powd >= 10 && this.wat>= 0.2){
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powd = this.coffee_powd - 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.wat = this.wat - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    private void MilkCoffee(){
        if(this.coffee_powd >= 10 && this.mlk >= 0.4 && this.wat>= 0.2){
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powd = this.coffee_powd - 10;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.mlk = this.mlk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.wat = this.wat - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.mlk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    public void start(){    //public Start to accese all private method of this class
        System.out.println(" ");
        System.out.println("|                   Coffee Machine By Manikant                   |");
        System.out.println(" ");
        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nCurrent Status: ");
        this.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n ----- ");
            System.out.println("|1:     Status of Ingredient     |\n--- \n|2:      Fill Ingredient         |\n --- \n|3:       Clean Machine |\n -- \n|4:        Make Coffee           |\n --- \n|5: How many Coffee We have made?|\n --- \n|6:        Exit |");
            System.out.println(" -- \n\n");
            char c = CoffeeMachine1.scan.next().charAt(0);
            switch(c){
                case '1':
                    System.out.println(" Status ");
                    this.GetIngredient();
                    System.out.println("---");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+this.Coffee_Count+" Coffees.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWants to Start Mechine Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y'){
            CoffeeMachine1 cm = new CoffeeMachine1();     //Instances For CoffeMachine
            cm.start();     //In order to call All Private Method Calling Public mathod
            System.out.println("Shutting Down...\n");
        }else
            System.out.println("Shutting Down...\n");
    }
}
import.java.util.Scanner;
class CoffeeMachine1{
    static Scanner scan = new Scanner(System.in);
    private double coffee_powd, mlk, wat;
    private int Coffee_Count = 0;
    public CoffeeMachine1(){
        this.coffee_powd=0;
        this.mlk=0;
        this.wat=0;
    }
    private void SetIngredient(){
        System.out.println("\nFilling...");
        this.coffee_powd = 500.0;
        this.mlk = 1;
        this.wat= 2;
        System.out.println("Filling Completed.");
    }
    private void GetIngredient(){
        System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
        System.out.println("Available Milk(Liter) "+String.format("%.1f", this.mlk));
        System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
    }
    private void CleanMachine(){
        System.out.println("\nCleaning Machine...");
        this.coffee_powd = 0;
        this.mlk = 0;
        this.wat= 0;
        System.out.println("Cleaning Completed.");
    }
    private void makecoffee(){
        System.out.println("\n  ");
        System.out.println("|   Select Type:   |\n  \n| 1:  Black Coffee |\n| 2:  Milk Coffee  |\n| 0   to Discard   |");
        System.out.println(" \n");
        char t = scan.next().charAt(0);
        switch(t){
            case '1':
                this.BlackCoffee();
                break;
            case '2':
                this.MilkCoffee();
                break;
            case '0':
                break;
        }
    }
    private void BlackCoffee(){
        if(this.coffee_powd >= 10 && this.wat >= 0.2){
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powd = this.coffee_powd- 10;
            System.out.println("Taking 0.2 liter of Water.");
            this.wat = this.wat - 0.2;
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    private void MilkCoffee(){
        if(this.coffee_powd >= 10 && this.mlk >= 0.4 && this.wat>= 0.2){
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            this.coffee_powd = this.coffee_powd- 10;
            System.out.println("Taking 0.4 Liter of Milk.");
            this.mlk = this.mlk - 0.4;
            System.out.println("Taking 0.2 liter of Water.");
            this.wat = this.wat - 0.2;
            System.out.println("\nYour Milk Coffee is Ready.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nAvailable Coffee Power(Gram) "+String.format("%.1f",this.coffee_powd));
            System.out.println("Available Milk(Liter) "+String.format("%.1f", this.mlk));
            System.out.println("Available Water(Liter) "+String.format("%.1f", this.wat));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    public void start(){    //public Start to accese all private method of this class
        System.out.println(" ");
        System.out.println("|                   Coffee Machine By Manikant                   |");
        System.out.println(" ");
        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nCurrent Status: ");
        this.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n ----- ");
            System.out.println("|1:     Status of Ingredient     |\n--- \n|2:      Fill Ingredient         |\n --- \n|3:       Clean Machine |\n -- \n|4:        Make Coffee           |\n --- \n|5: How many Coffee We have made?|\n --- \n|6:        Exit |");
            System.out.println(" -- \n\n");
            char c = CoffeeMachine1.scan.next().charAt(0);
            switch(c){
                case '1':
                    System.out.println(" Status ");
                    this.GetIngredient();
                    System.out.println("---");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+this.Coffee_Count+" Coffees.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWants to Start Mechine Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'Y' || d == 'y'){
            CoffeeMachine1 cm = new CoffeeMachine1();     //Instances For CoffeMachine
            cm.start();     //In order to call All Private Method Calling Public mathod
            System.out.println("Shutting Down...\n");
        }else
            System.out.println("Shutting Down...\n");
    }
}

