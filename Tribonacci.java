/*
* Create Tibonacci series starting with 0 1 1....
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static int fib(int n){
       
        if( n==0) return 0;
        if( n==1 || n==2)
            return 1;

            return fib(n-1) + fib(n-2) + fib(n-3);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Tibonacci using brute force linear approach:");
        
        int i = 0, j=1, k=1;
        int size = 10;
        int n =0;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        while(size > 0){
            n = i + j + k;
            i=j;
            j=k;
            k=n;
            size--;
            System.out.println(n);
        }
        
        
        System.out.println("Tibonacci using Recursion:");
        
        for(int l=0 ;l <10; l++){
            System.out.println(fib(l));
        }
        
    }
}

/* OUTPUT:

Tibonacci using brute force linear approach:
0
1
1
2
4
7
13
24
44
81
149
274
504
Tibonacci using Recursion:
0
1
1
2
4
7
13
24
44
81

=== Code Execution Successful ===


*/
