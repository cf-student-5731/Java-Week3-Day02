package intermediate;

public class WeekdayMenu extends Menu{

    public WeekdayMenu(String mainDish, String soup, String desert) {
        super(mainDish, soup, desert);
    }


    public void printMenu(){
        System.out.println(this.getMainDish());
        System.out.println(this.getSoup());
        System.out.println(this.getDesert());
    }
}
