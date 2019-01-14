public class Laptop {
    private String laptopType;
    private String laptopBrand;

    private String stateLaptop(){
        return String.format("I own an %s, %s", laptopBrand, laptopType);
    }
    public static void main(String[] args){
        Laptop mine = new Laptop();
        mine.laptopType = "MacBook Pro";
        mine.laptopBrand = "Apple";
        System.out.println(mine.stateLaptop());
    }
}
