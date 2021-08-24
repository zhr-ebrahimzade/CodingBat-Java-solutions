/*Given 2 positive int values, return the larger value that is in
 the range 10..20 inclusive,
 or return 0 if neither is in that range.
 */
public class Max1020 {
    public int max1020(int a, int b){
        if(a >= 10 && a <= 20){
            if(b >= 10 && b <= 20 && b >= a)
                return b;
            return a;
        }
        else if(b >= 10 && b <= 20)
            return b;
        return 0;
    }
}
