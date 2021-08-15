public class InOrder {
    public boolean inOrder(int a, int b, int c , boolean bOk){
        if (bOk)
            return c>b;
        else
            return (c>b && b>a);

    }
}
