/*
Given three int values, a b c, return the largest.*/
public class IntMax {
    public int intMax(int a, int b, int c){
        int max=a;
        if (max<b)
            max=b;
        if (max<c)
            max=c;
        return max;
    }
}
