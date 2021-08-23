/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20*/
public class More20 {
    public boolean more20(int num){
        int multiNum=num%20;
        return (multiNum==1 || multiNum==2);
    }
}
