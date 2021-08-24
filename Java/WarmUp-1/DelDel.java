/*
Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted. Otherwise, return
 the string unchanged.
*/
public class DelDel {
    public  String delDel(String str){
        if (str.indexOf("del")==1)
            return str.replace("del","");
        return str;
    }
}
