import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    float costBasis = 0;
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("Number of Buys : ");
		int noOfBuys = sc.nextInt();
		
		int[] noOfShares = new int[noOfBuys];
		float[] price = new float[noOfBuys];
		
		for(int i = 0; i < noOfBuys; i++)
		{
		    System.out.print("Number of shares in " + (i+1) + " buy : ");
		    noOfShares[i] = sc.nextInt();
		    
		    for(int j = i; j < price.length; j++)
		    {
		        System.out.print("Shares Purchase Price in " + (j+1) + " buy : ");
	            price[j] = sc.nextFloat();
	            break;
		    }
		}
		System.out.print("Enter Curent Stock Price : ");
		float currentStockPrice = sc.nextFloat();
		
		int totalNumberOfShares = 0;
          
        for (int i = 0; i < noOfShares.length ; i++) {
            totalNumberOfShares = totalNumberOfShares + noOfShares[i];
        }
        
        float stockProfit = (currentStockPrice - costBasis) * totalNumberOfShares;
        System.out.println("Current Value is : " + stockProfit);
        
        for(int i = 0; i < noOfBuys; i++)
        {
            costBasis = costBasis + price[i] * noOfShares[i];
        }
        System.out.println("Invested Value is " + costBasis);
        
        float average = costBasis / totalNumberOfShares;        

        float profit_lossPercentage = ((currentStockPrice - average) / average) * 100;
        System.out.println("Percentage is " + profit_lossPercentage);
        
        System.out.println("Total Number of Shares is " + totalNumberOfShares);
        
        System.out.println("Average is " + average);
	}
}
