package matrix;
public class No2PenguranganMatriks3x2 {
    public static void main(String[] args) {
    System.out.println("");
        System.out.println("Jawaban No.2");
        int matriks1 [][] = {
            {12,13},
            {22,23},
            {16,19}
        };
        int matriks2 [][] = {
            {4,5},
            {6,7},
            {8,9}
        };
        
        if(matriks1.length == matriks2.length && matriks1[0].length == matriks2[0].length){
            int matriks3 [][] = new int[matriks1.length][matriks1[0].length];
            
            for(int i = 0 ; i < matriks1.length; i++){
                for(int j = 0 ; j < matriks1[0].length; j++){
                    matriks3[i][j] = matriks1[1][j] - matriks2[i][j];
                }
            }
            for(int[] c: matriks3){
                for(int q: c){
                    System.out.print(q+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("Matriks Error");
        }
        System.out.println("Fajar Sidiq");

    }
}
