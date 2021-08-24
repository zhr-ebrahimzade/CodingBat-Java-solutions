/*
Return true if the given string contains between 1 and 3 'e' chars.*/
public class StringE {
    public boolean stringE(String str){
        int count=0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e')
                count++;
        }
        if (count<=3 && count>=1)
            return true;
        return false;
    }
}
