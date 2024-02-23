package ie.atu;

public class OnlineOrderSystem {

    public static  void main(String[] args){
        MenuItem[] menuItems = new MenuItem[]{
                new Pizza("Margherita",11.99,"Mozzarella Cheese, Pizza Dough, Basil, Tomato Sauce"),
                new Burger("Chicken Burger",9.99,"Crispy Chicken, Burger Buns, Coleslaw, Onion"),
                new Salad("Caesar Salad", 7.99, "Lettuce, Parmesan Cheese, Croutons, Salad dressing"),
                new Dessert("Chocolate Cake", 10.99, "Caster sugar, butter, eggs, flour, cocoa powder, dark chocolate")
        };

        for(MenuItem menuItem: menuItems){
            System.out.println("Name: "+menuItem.getName()+"\nDescription: "+menuItem.getDescription()+"\nPrice: "+menuItem.getPrice());
        }

        double totalCost = 0;
        for(MenuItem menuItem: menuItems){
            totalCost = totalCost+menuItem.getPrice();
        }
        System.out.println("Total Cost: $"+totalCost);

    }
}
