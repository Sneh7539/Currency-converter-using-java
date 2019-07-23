public class Currency {
  /**
  *    System.out.println("Invalid Arguments...");
  *    System.out.println("i.e. java <br> &lt;Curreny Value&gt; </br> <br> &lt;Convert Method&gt; </br>");
  *    System.out.println("i.e.<br> Curreny Value = Any Valid Number. </br>");
  *    System.out.println("i.e.<br> Convert Method  </br> <br> 1. Dollar To Rupees </br> <br> 2. Rupees To Dollar </br>");
  *    System.out.println("i.e.<br> java Currency 100 1 </br>");
  **/
  public static void main(String args[]) {
    if(args.length!=2)
    {
        System.out.println("Invalid Arguments...");
        System.out.println("i.e. java <Filename> <Curreny Value> <Convert Method>");
        System.out.println("i.e.<Curreny Value> = Any Valid Number.");
        System.out.println("i.e.<Convert Method> \n 1. Dollar To Rupees \n 2. Rupees To Dollar");
        System.out.println("i.e. java Currency 100 1");
        System.exit(0);
    }
    float money = Float.parseFloat(args[0]);
    float method = Float.parseFloat(args[1]);
    if(method==1)
    {
      float rupees = money/69;
      System.out.println("Your Dollar Value In Rupees = " + rupees + "INR");
    }
    else
    {
      float dollar = money*69;
      System.out.println("Your Rupees Value In Dollar = $ " + dollar);
    }
  }
}
