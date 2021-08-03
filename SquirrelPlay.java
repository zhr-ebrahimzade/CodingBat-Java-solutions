public class SquirrelPlay {
    public boolean squirrelPlay(int temp,boolean isSummer){
        if (!(isSummer))
             return (temp<=90 && temp>=60);
        else
            return (temp<=100 && temp>=60);
    }
}
