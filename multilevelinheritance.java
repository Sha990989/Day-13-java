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
class c extends b{
public void r1()
{
    System.out.println("Hello Teachers");
}
}

public class multilevelinheritance {
    public static void main(String args[])
    {
     c h=new c();
     h.p();
     h.r();
     h.r1();   
    }
}
   
