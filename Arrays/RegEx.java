package CSC1350_Fall24.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile(".\\w{3}");
        Pattern p = Pattern.compile("[\\w\\d.-_]*@\\w*.\\w{3}");
//        Matcher m = p.matcher(".com");
        Matcher m = p.matcher("assdf@asd.com");
        if(m.matches()) System.out.println("true");
    }
}
