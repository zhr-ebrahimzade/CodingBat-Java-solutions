public class SpecialEleven {
    public boolean specialEleven(int num){
        int multiNum=num%11;
        return  (multiNum==0 || multiNum==1);
    }
}
