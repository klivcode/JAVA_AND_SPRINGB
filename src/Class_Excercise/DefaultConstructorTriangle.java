package Class_Excercise;

public class DefaultConstructorTriangle {
    int side1,side2,side3;

    //Default constructor (no parms are is passed)
    public DefaultConstructorTriangle(){
        side1=3;
        side2=4;
        side3=5;
    }


    public int getPerimeter(){
        return side1+side2+side3;

    }

    public double getArea(){
        double s=(side1+side2+side3)/2.0;
        return Math.sqrt(s*(side1)*(s-side2)*(s-side3));
    }


    public static void main(String[] args) {
        DefaultConstructorTriangle obj=new DefaultConstructorTriangle();
        System.out.println("Perimeter of a Triangle"+obj.getPerimeter());
        System.out.println("Area of Triangle"+obj.getArea());
    }
}
