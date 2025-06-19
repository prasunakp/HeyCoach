public class BinarySearch {

    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};

          BinarySearch b = new BinarySearch();
        int index =   b.binerySearch(arr);
        System.out.println("index element "+index);

    }

    public int binerySearch(int[] arr){
        int l = 0;
        int r = arr.length-1;
        int target = 5;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid]>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return 2;
    }
}
