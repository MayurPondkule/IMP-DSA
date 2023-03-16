class Sorting{
    public static void main(String[] args) {
        int arr[]={5,7,3,1};

        //bubble sort   time complexity=O(n^2)
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             //swap
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        //selection sort time complexity=O(n^2)
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest=j;
        //         }
        //     }
        //     int temp=arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;

        // }

        //insertion sort O(n^2)             5 |7 3 1      5 7 | 3 
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}