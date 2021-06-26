package assignment3;

public class Driver {
    public static void main(String[] args){
        BuzzCard card = new BuzzCard(200,100,100);
        Student student = new Student("aiden",94555, card );

        System.out.println(student.toString());


        student.buyBrittainBuzzFunds(BrittainItem.BUFFET);
        student.buyBurdellsBuzzFunds(BurdellsItem.HOODIE);
        student.buyBrittainBuzzFunds(BrittainItem.BUFFET);
        student.buySubwayBuzzFunds(SubwayItem.DRINK);
        student.buySubwayDiningDollars(SubwayItem.CHIPS);

        System.out.println(card.getBuzzFunds());
        System.out.println(card.getDiningDollars());
        System.out.println(card.getMealSwips());

    }
}
