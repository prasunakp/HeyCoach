package ArraysLC;

public class DecodedXORedArray {
    public static void main(String[] args){
           int[] encoded = {1,2,3};
           int firstElement = 1;
           int[] arr = new int[encoded.length+1];
           arr[0] = firstElement;
           for(int i=1;i< arr.length;i++){
               arr[i] = arr[i-1]^encoded[i-1];
               System.out.println("ans are "+arr[i]);
           }
    }
}
