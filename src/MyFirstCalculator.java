
//Auther
// Kamlesh Paul 


import java.util.Scanner;
import javax.swing.JOptionPane;
public class MyFirstCalculator
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Calculator BY Paul Hacker !");
        String option = JOptionPane.showInputDialog(null, "Which calculator mode do you want?");
        if (option.equals("+"))
        {
            Double add1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Okay type the first number(s) of your addition problem."));
            Double add2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Now type the second number(s) of your addition problem."));
            Double preAdd = add1+add2;
            Double Add = preAdd;
            JOptionPane.showMessageDialog(null, "The sum is " + Add + ".");
        }
        else
        if (option.equals("-"))
        {
            Double sub1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Okay type the first number(s) of your subtraction problem."));
            Double sub2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Now type the second number(s) of your subtraction problem."));
            Double preSub = sub1-sub2;
            Double Sub = preSub;
            JOptionPane.showMessageDialog(null, "The difference is " + Sub + ".");
        }
        else
        if (option.equals("*"))
        {
            Double mult1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Okay type the first number(s) of your multiplication problem."));
            Double mult2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Now type the second number(s) of your multiplication problem."));
            Double preMult = mult1*mult2;
            Double Mult = preMult;
            JOptionPane.showMessageDialog(null, "The product is " + Mult + ".");
        }
        else 
        if (option.equals("/"))
        {
            Double div1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Okay type the first number(s) of your division problem."));
            Double div2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Now type the second number(s) of your division problem."));
            Double preDiv = div1/div2;
            Double Div = preDiv;
            JOptionPane.showMessageDialog(null, "The quotient is " + Div + ".");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Chutiya!!!!!!!!!! Paul Hacker Ka app hai usi se contact kr ");
        }
        //End of if statements.
    } 

}