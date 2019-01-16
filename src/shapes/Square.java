package shapes;

public class Square extends Rectangle{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public int getArea(){
        return (int) Math.pow(side, 2) ;
    }

    @Override
    public int getPerimeter(){
        return 4 * this.side;
    }
}
