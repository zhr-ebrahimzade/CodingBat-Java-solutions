/*Given a string, return a new string where "not " has been added to the front.
 However, if the string already begins with "not", return the string unchanged.
  Note: use .equals() to compare 2 strings.
 */
public class NoString {
    public String noString(String str){
        if (str.startsWith("not"))
            return str;
        return "not "+str;
    }

}
