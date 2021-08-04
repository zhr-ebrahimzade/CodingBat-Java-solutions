public class Less20 {
    public boolean less20(int num){
        int multiNum=(num+2)%20;
        return (multiNum==0 || multiNum==1);
    }
}
