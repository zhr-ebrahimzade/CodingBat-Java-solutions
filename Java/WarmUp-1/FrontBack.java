/*
Given a string, return a new string where the first and last chars have been exchanged.
*/
public class FrontBack {
    public String frontBack(String str){
        if (str.length()<=1)
            return str;
        char first=str.charAt(0);//be careful with the order of lines!
        char last=str.charAt(str.length()-1);
        return last+str.substring(1,str.length()-1)+first;
    }
}
