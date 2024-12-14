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
public class singleinheritance
{
    public static void main(String args[])
    {
        a h=new a();
        h.p();
        b y=new b();
        y.p();
        y.r();
    }
}
 