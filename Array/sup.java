
/**
 * Write a description of class sup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sup
{
    // instance variables - replace the example below with your own
    private int x = 1;
    int[] fibs = new int[10];
    public void main(String[] args){
        
        for (int i = 0; i < 10; i++){
            System.out.println(""+x);
            fibs[i] = x;
            x += fibs[i];
        }
    }
}
