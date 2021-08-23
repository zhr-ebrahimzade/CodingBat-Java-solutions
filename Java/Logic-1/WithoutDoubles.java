/*Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value,
 increment one die to the next value,
 wrapping around to 1 if its value was 6.*/
public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles){
        int sum=die1+die2;
        if (sum==12 && noDoubles) /*Be careful with the order of if statements (It may not be a good practice
         to use it this way ).
        you could use nested-loop version of if statements*/
            return die1+1;
        else if (noDoubles && die1==die2)
            return sum+1;
        return sum;
    }
}
