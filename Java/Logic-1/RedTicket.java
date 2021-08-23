/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
If they are all the value 2, the result is 10.
Otherwise if they are all the same, the result is 5.
Otherwise so long as both b and c are different from a, the result is 1.
Otherwise the result is 0.
*/
public class RedTicket {
    public int redTicket(int a, int b, int c){
        if (a==b && b==c){
            if (a==2)
                return 10;
            return 5;
       }
        else if (a!=b && a!=c)
            return 1;
        return 0;
    }
}
