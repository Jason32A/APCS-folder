public class DriverForFood
{
    public static void foodItemTester()
    {
        FoodItem item1 = new FoodItem("Frozen Enchiladas", 3.75, 2.75, 200, 10);
        FoodItem item2 = new FoodItem("Green Apples", 1.99, 0.50);
        FoodItem item3 = new FoodItem("Organic Skim Milk", 5.49, 3.99, 50, 50);
        FoodItem item4 = new FoodItem();
        
        System.out.println(item1 + "\n" + item2 + "\n" + item3 + "\n" + item4 + "\n");
        
        item4.setDescription("Snickers");
        item4.setUnitPrice(-1.0);
        item4.setUnitCost(-1.0);
        item4.addToStock(-20);
        item4.setUnitPrice(0.75);
        item4.setUnitCost(0.35);
        item4.addToStock(500);
        item4.setWeight(-3);
        item4.setWeight(2);
        
        
        FoodItem[] items = {item1,item2,item3,item4};
        
        item1.sell(-5);
        item1.sell(5);
        item2.sell(10);
        item3.sell(3);
        item4.sell(20);
        
        for (int x = 0; x < items.length; x++)
            System.out.println("Item #" + items[x].getIDNum() + " Profit: " + 
                               items[x].getCmItemProfit());
        
        System.out.println("Total Profit: " + FoodItem.getTotalProfit() + 
                           "\n\nAre any items equal to each other?" + "\n");
        
        for (int x = 0; x < items.length; x++)
        {
            String s = "";
            for (int y = 0; y < items.length; y++)
            {
                if (items[x].equals(items[y]))
                    s += "Yes, ";
                else
                    s += "No, ";
            }
            System.out.println(s.substring(0,s.length()-2));
        }
    }
        
    public static void cashRegisterTester()
    {
        CashRegister reg1 = new CashRegister();
        CashRegister reg2 = new CashRegister();
        CashRegister reg3 = new CashRegister();
         
        FoodItem item1 = new FoodItem("Frozen Enchiladas", 3.75, 2.75, 200, 10);
        FoodItem item2 = new FoodItem("Green Apples", 1.99, 0.50);
        FoodItem item3 = new FoodItem("Organic Skim Milk", 5.49, 3.99, 50, 50);
        FoodItem item4 = new FoodItem();
        
        CashRegister[] regArr = {reg1, reg2, reg3};
        FoodItem[] itemArr = {item1, item2, item3, item4};
        
        for (int regIndex = 0; regIndex < regArr.length; regIndex++)
        {
            for (int itemIndex = 0; itemIndex < itemArr.length; itemIndex++)
            {
                if (itemArr[itemIndex].getItemStock() < itemIndex + regIndex)
                    regArr[regIndex].scanItem(itemArr[itemIndex], itemArr[itemIndex].getItemStock());
                else
                    regArr[regIndex].scanItem(itemArr[itemIndex], itemIndex + regIndex);
            }
            regArr[regIndex].closeSale();
        }
        System.out.println("Total All Registers: $" + ((int)(100*CashRegister.getTotalAllRegisters())/100.0));
        System.out.println("Total FoodItem Rev:  $" + ((int)(100*FoodItem.getTotalRevenue())/100.0));
        
        System.out.println("FoodItem revenue matches CashRegister total: " + CashRegister.verifySales());
    }

//     public static void swap1(FoodItem food1, FoodItem food2)
//     {
//         food2 = food1;
//     }
//     public static void swap2(FoodItem food1, FoodItem food2)
//     {
//         food2.setUnitPrice(food1.getUnitPrice());
//     }

//     public static void main(String[] args)
//     {
//         FoodItem item1 = new FoodItem("chicken soup", 2.29, 1.29);
//         FoodItem item2 = new FoodItem("Snickers", 1.75, 0.99);
//         FoodItem item3 = new FoodItem("Green Beans", 1.56, 0.79);
//         
//         swap1(item3, item2);
//         swap2(item1, item3);
//         swap2(item2, item1);
//         
//         System.out.println("item1: " + item1.getUnitPrice());
//         System.out.println("item2: " + item2.getUnitPrice());
//         System.out.println("item3: " + item3.getUnitPrice());
//     }
}   