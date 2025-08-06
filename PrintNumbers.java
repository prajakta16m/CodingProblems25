// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int n = 7;
        for(int i=1; i<= n; i++){
            int k = i;
            int diff = n-1;
            for(int j=1; j<=i ; j++){
                System.out.print(k + " ");
                k=k+diff;
                diff--;
            }
            System.out.println();
        }
    }
}
/*
  OUTPUT:

  Try programiz.pro
1 
2 8 
3 9 14 
4 10 15 19 
5 11 16 20 23 
6 12 17 21 24 26 
7 13 18 22 25 27 28 

=== Code Execution Successful ===
*/
