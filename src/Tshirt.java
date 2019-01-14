public class Tshirt {
    private String shirtMaterial;
    private int shirtQuanitity;
    private String shirtColor;

    private String purchase(){
        return String.format("I would like to buy %d, %s, %s shirt please.",
                shirtQuanitity,
                shirtColor,
                shirtMaterial
                );
    }
    public static void main(String[] args){
        Tshirt purchase = new Tshirt();
        purchase.shirtMaterial = "Cotton";
        purchase.shirtQuanitity = 1;
        purchase.shirtColor = "Blue";
        System.out.println(purchase.purchase());
    }
}
