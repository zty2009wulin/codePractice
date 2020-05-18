class Solution {
    public int[] sortedSquares(int[] A) {
        int []arr = new int [A.length];
        for(int i=0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        if(A.length==1){
            return A;
        }
        
        
        for(int i=0;i<A.length;i++){
            print(A);
            for(int k=0;k<A.length;k++){
                int temp = A[k];
                int tempPos =k;
                for(int j=1;j<A.length;j++){
                    if(temp>A[j]){
                         swap(tempPos,j,A);
                        tempPos = j;
                    }
                }
            }
            
        }
        return A;
        
    }
    public void swap(int pos1 ,int pos2, int[]arr){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    public void print(int[]arr){
        System.out.println();
        for(int e:arr){
            System.out.print(e);
        }
    }
}
