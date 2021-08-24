/*
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 Return true if the given non-negative number is special. Use the % "mod" operator*/
public class SpecialEleven {
    public boolean specialEleven(int num){
        int multiNum=num%11;
        return  (multiNum==0 || multiNum==1);
    }
}
