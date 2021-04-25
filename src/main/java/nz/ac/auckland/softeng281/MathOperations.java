package nz.ac.auckland.softeng281;

public class MathOperations{

    public int max(int a, int b){
        if(a>=b){
            return a;
        }
        return b;
    }

    public int max(int a, int b, int c){
      int maxBetweenAandB = max(a,b);
      return max(maxBetweenAandB,c);
    }
}