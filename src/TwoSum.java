class TwoSum{
    public static void main (String args[]){
        int arr[] = {1,2,4,6,3,7,23,39};
        int target = 8;
        boolean status = false;
//     System.out.println("arr length: "+arr.length);

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.print("The target number " +target+" is found: ");
                    System.out.println("indices are: "+(i+1) +" and "+ (j+1));
                    status = true;
                    return;
                }
            }
        }
        if (!status) System.out.println("The target was not found");
    }
}