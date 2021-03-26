package matrix;
public class No3PerkalianMatriks2x3dan3x2 {
    public static void main(String[] args){
        System.out.println("Jawaban No. 3");
            
            int matriks4[][] = {
                {21,2,6},
                {23,4,8}
            };
            
            int matriks5[][] = {
                {5,7},
                {6,3},
                {9,2}
            };
            
            
   int matriks6 [][] = new int[matriks4.length][matriks5[0].length];
         for(int x = 0; x < matriks4.length; x++){
             for(int y = 0 ; y < matriks5[0].length; y++){
                 for(int z = 0 ; z < matriks4[0].length; z++){
                     matriks6[x][y] += matriks4[x][z] * matriks5[z][y];
                 }
                }
            }
            for(int[] c: matriks6){
            for(int q: c){
                System.out.print(q+"\t");
            }
            System.out.println();
       }
         
         System.out.println("Fajar Sidiq");
}
}
