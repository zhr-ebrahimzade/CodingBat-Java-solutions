/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.
abs(n)returns the absolute value of a number.
*/
public class Close10 {
    public int close10(int a, int b){
        int nearA=Math.abs(10-a);
        int nearB=Math.abs(10-b);
        if (nearA<nearB)
            return a;
        else if (nearA==nearB)
            return 0;
        return b;
    }
}
