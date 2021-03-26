package matrix;
public class No1Matriks3x3 {
    public static void main(String[] args) {
        System.out.println("Jawaban No 1.");
        int matrix[][]={
            {34,56,41},
            {45,36,37},
            {51,32,46}
        };
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Fajar Sidiq");
    }
}
