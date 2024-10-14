package Module19mergesort;

public class A1merge2array {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        int[] merge = new int[a.length+b.length];
        
        for(int i=0;i<a.length;i++){
            merge[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            merge[a.length+i] = b[i];
        }

        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
        System.out.println();
    }
}
