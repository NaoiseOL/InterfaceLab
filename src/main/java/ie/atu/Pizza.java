package ie.atu;

public class Pizza implements MenuItem{
    private String name;
    private double price;
    private String toppings;

    public Pizza(String name, double price, String toppings){
        this.name=name;
        this.price=price;
        this.toppings=toppings;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getDescription(){
        return toppings;
    }

}
