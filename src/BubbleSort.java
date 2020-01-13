public class BubbleSort {
    
    public static void main(String[] args) {
        int[] angka = {3,6,1,4,2,5};
        int i,j,k,temp;
        
        System.out.println("Array Bubble Sort sebelum diurutkan:");
        for(i=0; i<angka.length; i++){
            System.out.print(angka[i]+" ");
        }
        
        System.out.println("\n");
        for(i=1; i<angka.length-1; i++){
            System.out.println("Iterasi " +i);
            for(j=angka.length-1; j>=i; j--){
                if(angka[j] < angka[j-1]){
                    temp = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = temp;
                }
                for(k=0; k<angka.length; k++){
                    System.out.print(angka[k]+"\t");
                }
                System.out.println();
            }
        }
        System.out.print("\n");
        System.out.println("Array Bubble Sort setelah diurutkan:");
        for(i=0; i<angka.length; i++){
            System.out.print(angka[i]+" ");
        }
    }  
}
