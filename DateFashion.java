public class DateFashion {
    public int dateFashion(int you,int date){
        if(you>2 && date>2){
            if (you>=8 || date>=8)
                return 2;
            else
                return 1;
        }
        else
            return 0;
    }
}
