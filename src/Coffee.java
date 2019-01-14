public class Coffee {
    private String coffeeType;
    private String coffeeSize;
    private double coffeePrice;

    private String coffeeOrder(){
        return String.format("I ordered a %s %s. %nIt cost me $%.2f", coffeeSize, coffeeType, coffeePrice);
    }
    public static void main(String[] args){
        Coffee order = new Coffee();
        order.coffeeType = "Latte";
        order.coffeeSize = "medium";
        order.coffeePrice = 4.75;
        System.out.println(order.coffeeOrder());
    }
}
