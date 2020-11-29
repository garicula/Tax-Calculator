// Garrick Morley 9/12/2019

package morleygassignmentone; 

/**
 *
 * @author morleyg1
 */
import javax.swing.JOptionPane;

public class MorleyGAssignmentOne {

    public static void main(String[] args) {
    //declare variables
    double price, stateTaxAmount, countyTaxAmount, totalTax, totalCost;
    double stateTax = 0.08;
    double countyTax = 0.03;
    
    //get user input
    //another way 
    price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of item"));
    
    //processing
    stateTaxAmount = price * stateTax;
    countyTaxAmount = price * countyTax;
    totalTax = stateTaxAmount + countyTaxAmount;
    totalCost = price + totalTax;
    
    //message stuff
    String MessageDisplay;
    
    MessageDisplay = String.format("The price is$%.2f \nState tax is$%.2f"
                + "\nCounty tax is$%.2f, \nTotal tax is$%.2f, \nTotal cost is$%.2f."
                + "", price, stateTaxAmount, countyTaxAmount, totalTax, totalCost);
    
    JOptionPane.showMessageDialog(null,MessageDisplay); 
    

//Ignore these, just used for testing.
//System.out.print(totalCost);
//System.out.print(stateTaxAmount);
//System.out.print(countyTaxAmount);
//System.out.print(totalTax);
    
    
    }
    
}
