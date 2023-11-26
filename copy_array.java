

public class copy_array{
    public static void main(String[] args){
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        int i;
        //copying the elements from arr1 to arr2
        for(i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }

        //printing originalarray elements
        System.out.println("Original elements:");
        for(i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println();

        //printing the copied array elements
        System.out.println("Copied elements:");
        for(i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }

    }
}