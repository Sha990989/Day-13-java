import java.util.*;
class a{
    public void p()
    {
        System.out.println("Hello Students");
    }
}
class b extends a{
    public void r()
    {
        System.out.println("Hello Everyone");
    }

}
class c extends a{
public void r1()
{
    System.out.println("Hello Teachers");
}
}

public class hierarchialinheritance {
    public static void main(String args[])
    {
    b h=new b();
    h.p();
    h.r();
    c b=new c();
    b.p();
    b.r1();
    }
}
   
