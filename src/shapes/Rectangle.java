package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //    constructor:
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
//    method that gets the area
    public int getArea(){
        return length*width;
    }
//    method that gets the perimeter
    public int getPerimeter(){
        return 2 * length + 2 * width;
    }
}
