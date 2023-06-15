import java.util.ArrayList;

public class MajorityElementTwo {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        // Write your code here.
        int count1=0;
        int count2=0;
        int number1 = -1;
        int number2 = -1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == number1){
                count1+=1;
            }
            else if (arr.get(i) == number2) {
                count2+=1;
            }
            else if(count1==0){
                number1 = arr.get(i);
                count1 = 1;
            }
            else if(count2==0){
                number2 = arr.get(i);
                count2 = 1;
            }
            else{
                count1-=1;
                count2-=1;
            }
        }
        ArrayList<Integer> lis = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == number1){
                count1+=1;
            }
            else if(arr.get(i) == number2){
                count2+=1;
            }
        }
        if(count1>arr.size()/3){
            lis.add(number1);
        }
        if(count2>arr.size()/3){
            lis.add(number2);
        }
        return lis;

    }
}
