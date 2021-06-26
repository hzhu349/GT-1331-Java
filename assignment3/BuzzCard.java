package assignment3;

public class BuzzCard {
    public int mealSwipes;
    public double buzzFunds;
    public double diningDollas;

    public BuzzCard(int mealSwipes,double diningDollas, double buzzFunds) {
        this.mealSwipes = mealSwipes;
        this.buzzFunds = buzzFunds;
        this.diningDollas = diningDollas;
    }

    /**
     * Getter method for the buzz funds required to buy an item.
     * @return Buzz funds cost of item.
     */
    public double getBuzzFunds() {
        return buzzFunds;
    }

    /**
     * Getter method for the dining dollars required to buy an item.
     * @return Dining dollar cost of item.
     */
    public double getDiningDollars() {
        return diningDollas;
    }

    public int getMealSwips(){return mealSwipes;}

    public void minusMealSwipes(int count) {
        if (count > mealSwipes){
            System.out.println("Your Meals Plan is not Enough!");
            return;
        }
        mealSwipes -= count;
    }

    public void minusDiningDollars(double count) {
        if (count > mealSwipes){
            System.out.println("Your Meals Plan is not Enough!");
            return;
        }
        mealSwipes -= count;
    }

    public void minusBuzzfunds(double charge) {
        if (charge > buzzFunds){
            System.out.println("Your Meals Plan is not Enough!");
            return;
        }
        buzzFunds -= charge;
    }
    private String toString(int mealSwipes, double diningDollas, double buzzFunds){
        return "Buzzcard balance with Dining Dollars: " +diningDollas + ", BUzzfunds; " + buzzFunds +", Meal Swipes: "+ mealSwipes;
    }
}
