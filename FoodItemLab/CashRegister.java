
public class CashRegister
{
    private double customerTotal = 0.0;
    private double registerTotal = 0.0;
    
    private static double totalAllRegisters = 0.0;
    
    public void scanItem (FoodItem object, int amount)
    {
        double sale = object.sell(amount);
        System.out.println("Customer bought " + amount + " " + object.getDescrip() +" for a total of $" + sale);
        customerTotal += sale;
        registerTotal += sale;
        totalAllRegisters += sale;
    }
    
    public double closeSale()
    {
       double sale = customerTotal;
       customerTotal = 0;
       System.out.println("Customer Total: $" + sale);
       return sale;
    }
    
    public static double getTotalAllRegisters ()
    {
        return totalAllRegisters;
    }
    
    public static boolean verifySales ()
    {
        return totalAllRegisters == FoodItem.getTotalRevenue();
    }
}
