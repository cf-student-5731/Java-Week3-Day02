package intermediate;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        Menu monday = new WeekdayMenu("Grilled Chicken", "Vegetable Soup", "Chocolate Cake");
        Menu tuesday = new WeekdayMenu("Grilled Pork", "Chicken Soup", "Ice cream");
        Menu wednesday = new WeekdayMenu("Grilled Beef", "Pork Soup", "Bananas");
        Menu thursday = new WeekdayMenu("Grilled Rabbit", "Beef Soup", "Strawberry Cake");
        Menu friday = new WeekdayMenu("Grilled Hamster", "Rabbit Soup", "Strawberry Cake");

        Menu saturday = new WeekendMenu("Orange Juice", "Grilled Human", "Hamster Soup", "Apple cake");
        Menu sunday = new WeekendMenu("Apple Juice", "Baked Human", "Human Soup", "Meat Cake");

        System.out.println(monday.getSoupOfTheDay());
        System.out.println(tuesday.getSoupOfTheDay());
        System.out.println(wednesday.getSoupOfTheDay());
        System.out.println(thursday.getSoupOfTheDay());
        System.out.println(friday.getSoupOfTheDay());
        System.out.println(saturday.getSoupOfTheDay());
        System.out.println(sunday.getSoupOfTheDay());
        System.out.println();
        ((WeekdayMenu) monday).printMenu();
        System.out.println();
        ((WeekdayMenu) tuesday).printMenu();
        System.out.println();
        ((WeekdayMenu) wednesday).printMenu();
        System.out.println();
        ((WeekdayMenu) thursday).printMenu();
        System.out.println();
        ((WeekdayMenu) friday).printMenu();
        System.out.println();
        System.out.println();
        ((WeekendMenu) saturday).printMenu();
        System.out.println();
        ((WeekendMenu) sunday).printMenu();


        System.out.println("LLLLLLLLLLOOOOOOOOOOOOOOOPPPPPPPIIIIIIIIIIINNNNNNNNNNGGGGGGGGGG");

        ArrayList<Menu> weekMenu = new ArrayList<>();
        weekMenu.add(monday);
        weekMenu.add(tuesday);
        weekMenu.add(wednesday);
        weekMenu.add(thursday);
        weekMenu.add(friday);
        weekMenu.add(saturday);
        weekMenu.add(sunday);

        for(Menu d : weekMenu){
            System.out.println();
            if(d instanceof WeekdayMenu){
                ((WeekdayMenu) d).printMenu();
            }

            if(d instanceof WeekendMenu){
                ((WeekendMenu) d).printMenu();
            }

        }

    }
}
