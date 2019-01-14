package util;

public class InputTest {

    public static void main(String[] args){
        Input input = new Input();
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,5));
        System.out.println(input.getDouble(3.5,6.5));

    }
}
