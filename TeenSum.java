public class TeenSum {
    public int teenSum(int a, int b){
        if (a<=19 && a>=13 || b<=19 && b>=13)
            return 19;
        return a+b;
    }
}
