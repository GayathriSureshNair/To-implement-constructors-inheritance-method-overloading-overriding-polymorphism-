abstract class shape
{
    abstract void numberOfSides();
}
class rectangle extends shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of rectangle is 4");
    }
}
class triangle extends shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of triangle is 3");
    }
}
class hexagon extends shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of hexagon is 6");
    }
}
class Shape
{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        r.numberOfSides();
        triangle t=new triangle();
        t.numberOfSides();
        hexagon h=new hexagon();
        h.numberOfSides();  
    }
}
