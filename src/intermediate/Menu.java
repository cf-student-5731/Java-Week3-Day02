package intermediate;

public abstract class Menu {

    private String appetizer, mainDish, soup, desert;

    public Menu(String appetizer, String mainDish, String soup, String desert) {
        this.appetizer = appetizer;
        this.mainDish = mainDish;
        this.soup = soup;
        this.desert = desert;
    }

    public Menu(String mainDish, String soup, String desert) {
        this.mainDish = mainDish;
        this.soup = soup;
        this.desert = desert;
    }

    public String getSoupOfTheDay(){
        return this.soup;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }
}
