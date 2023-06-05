public class sortColors {
    public static void main(String[] args) {

    }
    public static void sortColors(int[] arr) {
        int nz=0;
        int nt = arr.length-1;
        int i=0;
        while(i<=nt){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz+=1;
                i+=1;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
            }
        }
    }
}
