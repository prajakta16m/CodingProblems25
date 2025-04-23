// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int i = 0;
        int j = 1;
        int k;
        
        System.out.println(i);
        System.out.println(j);
        while(i<50) {
            System.out.println(j+i);
                k = i;
                i = j;
                j = j+k;
        }
        
        
    }
}
