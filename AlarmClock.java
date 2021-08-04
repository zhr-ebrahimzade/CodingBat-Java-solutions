public class AlarmClock {
    public String alarmClock(int day, boolean vacation){
        if(!vacation){
            if (day<=5 && day>0)
                 return "7:00";
            return "10:00";
        }
        else{
            if (day<=5 && day>0)
                return "10:00";
             return "off";
        }
    }
}
