/*
Return true if the given string begins with "mix",
except the 'm' can be anything, so "pix", "9ix" .. all count.*/
public class MixStart {
    public boolean mixStart(String str){
        return  str.startsWith("ix",1);

    }
}
