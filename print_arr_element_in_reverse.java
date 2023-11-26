public class print_arr_element_in_reverse {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,0};

        //printing the element in reverse order
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
}
