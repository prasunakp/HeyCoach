package ArraysLC;

public class DecodeXORedArray {
    public static void main(String[] args){
        int[] encoded= {6,2,7,3};
        int first = 4;
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i=0;i< encoded.length;i++){
            arr[i+1] =  encoded[i]^arr[i];
        }
for(int an : arr){
    System.out.println(an);
}
    }


}
