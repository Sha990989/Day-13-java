public class trycatchfinallyblocks {
public static void main(String args[])
{
    //try-catch
    try{
        int d=90/0;
    }
    catch(ArithmeticException v)
    {
        System.out.println("Badrequest");
    }
    //try-catch and finnally
    try{
        int d=90/0;
    }
    catch(ArithmeticException v)
    {
      System.out.println("catch block is runnning");
    }
    finally{
        System.out.println("Finally block is running");
    }
}
}
