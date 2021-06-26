package assignment3;
public class Student {
    public String name;
    public int id;
    public BuzzCard card;


    public Student(String name,int id, BuzzCard card){
        this.name = name;
        this.id = id;
        this.card = card;
    }

    /**
     * Getter method for the buzz funds required to buy an item.
     * @return Buzz funds cost of item.
     */
    public int getId() {
        return id;
    }

    /**
     * Getter method for the dining dollars required to buy an item.
     * @return Dining dollar cost of item.
     */
    public String getName() {
        return name;
    }



    public void buyBrittainMealSwipes(BrittainItem item){
        if (this.card.getMealSwips() <1){
            System.out.println("You do not have the amount to buy this item :(");
        }
        else{
            this.card.minusMealSwipes( 1);
        }
    }

    public void buyBrittainBuzzFunds(BrittainItem item){

        if (item.getBuzzFunds() > this.card.getBuzzFunds()){
            System.out.println("You do not have the amount to buy this item :(");
        }
        else{
            this.card.minusBuzzfunds(item.getBuzzFunds());
        }
    }

    public void buyBurdellsBuzzFunds(BurdellsItem item){
        if (item.getBuzzFunds() > this.card.getBuzzFunds()){
            System.out.println("You do not have the amount to buy this item :(");
        }
        else{
            this.card.minusBuzzfunds(item.getBuzzFunds());
        }

    }

    public void buySubwayDiningDollars(SubwayItem item){
        if (item.getDiningDollars() > this.card.getDiningDollars())
            System.out.println("You do not have the amount to buy this item :(");

        else
            this.card.minusDiningDollars(item.getDiningDollars());
    }

    public void buySubwayBuzzFunds(SubwayItem item) {
        if (item.getBuzzFunds()> this.card.getBuzzFunds())
            System.out.println("You do not have the amount to buy this item :(");

        else
            this.card.minusBuzzfunds(item.getBuzzFunds());
    }

    public String toString(){
        return "Student named "+ name +" with ID: " + id;
    }
}
