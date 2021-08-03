public class SortASum {
    public int sortASum(int a , int b){
        int sum=a + b;
        if (sum>=10 && sum<=19)
            return 20;
        else
            return sum;
    }
}
