
/**
 * csc401 Lab05 Assignment2 .
 *
 * @author (OZORDI KENECHUKWU U15/FNS/CSC/001)
 */
public class Quadratic
{
    private double a, b, c;
    private double equat = Math.pow(b,2) - (4 * a * c);
   
    
    public Quadratic(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    
    
    }

    
    public double rt1(){
    double root1 = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
    return root1;
    }
    
      public double rt2(){
    double root2 = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
    return root2;
    }
    
 
    
    
}
