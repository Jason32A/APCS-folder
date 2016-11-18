
/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodItem
{
    private String itemDescrip;
    private double itemPrice;
    private double itemCost;
    private int itemStock;
    private double itemWeightOz;
    
    private double cmItemRev;
    private double cmItemProfit;
    private static double totalRev = 0;
    private static double totalProfit = 0;
    
    private String idNum;
    private static int nextAvailableID = 10000;

    public FoodItem (String Descrip,double price, double cost, int stock, double weight)
    {
        itemDescrip = Descrip;
        itemPrice = price;
        itemCost = cost;
        itemStock = stock;
        itemWeightOz = weight;
        cmItemRev = 0;
        cmItemProfit = 0;
        idNum = ""+ nextAvailableID;
        nextAvailableID++;
    }

    public FoodItem (String Descrip,double price, double cost)
    {
        this(Descrip,price,cost,0,80.0);
    }

    public FoodItem()
    {
        this("No Description", 0.0,0.0,0,0.0);
    }

    public String getDescrip()
    {
        return itemDescrip;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public double getItemCost()
    {
        return itemCost;
    }

    public int getItemStock()
    {
        return itemStock;
    }

    public double getItemWeightOz()
    {
        return itemWeightOz;
    }
    
    public double getCmItemRevenue ()
    {
        return cmItemRev;
    }
    
    public double getCmItemProfit()
    {
        return cmItemProfit;
    }
    
    public String getIDNum()
    {
        return idNum;
    }
    
    public static double getTotalRevenue()
    {
        return totalRev;
    }
    
    public static double getTotalProfit()
    {
        return totalProfit;
    }

    public void setDescription(String Descrip)
    {
        itemDescrip = Descrip;
    }

    public void setUnitPrice(double price)
    {
        if (price/itemPrice > 1.5)
        {
            System.out.println("Price changed by over 50%!");
            System.out.println("Old price:" + itemPrice + " New price:" + price);
        }
        if (price < 0)
        {
            System.out.println("WARNING! PAYING CUSTOMERS TO TAKE OUR PRODUCT!");
        }
        else
        {
            itemPrice = price;
        }
    }

    public void setUnitCost(double cost)
    {
        if (cost> itemCost)
        {
            System.out.println("WARNING! Unit cost increase!");
            System.out.println("Old cost:" + itemCost + " New cost:" + cost);
        }
        if(cost < 0)
        {
            System.out.println("WARNING! OUR SUPPLIERS ARE PAYING US MONEY TO TAKE THEIR PRODUCT!");
        }
        else
        {
            itemCost = cost;
        }
    }

    public void addToStock(int stock)
    {
        if (stock < 0)
        {
            System.out.println("WARNING! ATTEMPT TO GET NEGATIVE STOCK!");
        }
        else
        {
            itemStock += stock;
        }
    }

    public void addToStock()
    {
        this.addToStock(1);
    }
    
    public void addToItemRev(double rev)
    {
        cmItemRev += rev;
    }
    
    public void addToItemProf (double prof)
    {
        //USE NEGATIVE NUMBERS TO REPRESENT COST!
        cmItemProfit += prof;
    }
    
    public void setWeight(double weight)
    {
        if (weight >= 0.0)
        {
            itemWeightOz = weight;
        }
        else
        {
            System.out.println("WARNING! ATTEMPT TO DEFY GRAVITY! (oz is less than zero)");
        }
    }

    public double sell(int stock)
    {
        if((itemStock - stock) < 0)
        {
            System.out.println("WARNING! ATTEMPT TO SELL STOCK WE DON'T HAVE! (sell is greater than stock)");
            double sale = itemStock * itemPrice;
            double cost = itemStock * itemCost;
            itemStock = 0;
            cmItemRev += sale;
            cmItemProfit += sale-cost;
            totalRev += sale;
            totalProfit += sale-cost;
            return sale;
        }
        else if(stock < 0)
        {
            System.out.println("WARNING! ATTEMPT BY CUSTOMERS TO SELL PRODUCT!");
            return 0.0;
        }
        else
        {
            itemStock -= stock;
            double sale = stock * itemPrice;
            double cost = stock * itemCost;
            cmItemRev += sale;
            cmItemProfit += sale-cost;
            totalRev += sale;
            totalProfit += sale-cost;
            return stock*itemPrice;
        }
    }
    public void sell()
    {
        this.sell(1);
    }
    public String toString()
    {
        return new String("Description:" + itemDescrip + " Price:" + itemPrice + " Cost:" + itemCost + " Stock:" + itemStock + " Weight:" + itemWeightOz + " ID:" + idNum);
    }
    public boolean equals (String otherDescrip)
    {
        return this.toString().equals(otherDescrip);
    }
}
