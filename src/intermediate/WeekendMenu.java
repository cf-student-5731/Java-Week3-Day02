package intermediate;

public class WeekendMenu extends Menu{

    public WeekendMenu(String appetizer, String mainDish, String soup, String desert) {
        super(appetizer, mainDish, soup, desert);
    }


    public void printMenu(){
        System.out.println(this.getAppetizer());
        System.out.println(this.getMainDish());
        System.out.println(this.getSoup());
        System.out.println(this.getDesert());
    }

}
