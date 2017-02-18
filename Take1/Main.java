public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.go();
    
    }
    
    public void go()
    {
        Square sq = new Square(6);
        Rectangle r = new Rectangle(10, 5);
        Line l = new Line(7);
        
        
        sq.draw();
        System.out.println("\n");
        r.draw();
        System.out.println("\n");
        l.draw();
        System.out.println("\n");
    }
    
    public class Square
    {
        
    }
    }
}