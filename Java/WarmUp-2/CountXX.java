/*
Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/
public class CountXX {
    public int countXX(String str){
        int countXX=0;
        for (int i=0; i<str.length()-1;i++){
            if (str.substring(i,i+2).contains("xx"))
                countXX=countXX+1;

        }
        return countXX;
    }
}
