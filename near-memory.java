public class MyClass {
    public static void main(String args[]) {
     long start1 = System.currentTimeMillis();
    buildSquare(10000);
    long end1 =System.currentTimeMillis();
    System.out.println("time" +" "+ ( end1-start1));
    long start2 = System.currentTimeMillis();
    buildSquareopt(10000);
    long end2 =System.currentTimeMillis();
    System.out.println("time2" +" "+ ( end2-start2));

    }
    public static  int[][] buildSquare(int size){
         int[][] tmp = new int[size][size];
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                tmp[i][j]=i*j;
            }
         }
         return tmp;
    }
    
    public static  int[][] buildSquareopt(int size){
         int[][] tmp = new int[size][size];
         for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                tmp[i][j]=i*j;
                tmp[j][i]=i*j;
            }
         }
         return tmp;
    }
}
