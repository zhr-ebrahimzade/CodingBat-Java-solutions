/*Given a string, return true if the first instance of "x" in the string
is immediately followed by another "x".
 */
public class DoubleX {
    public boolean doubleX(String str){
        boolean result=false;
        for (int i=0;i<str.length()-1;i++){
            if (str.substring(i).startsWith("x")){
                if (str.substring(i,i+2).endsWith("x"))
                    result=true;
                break;
            }
        }
        return result;
    }
}
