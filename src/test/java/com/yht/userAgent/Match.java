package com.yht.userAgent;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yinmuyang on 16/7/21.
 */
public class Match {
    @Test
    public void test(){
//        Pattern pattern = Pattern.compile("^Java.*");
        Pattern pattern = Pattern.compile(".*Android [0-9].[0-9].*;.*");
        Matcher matcher = pattern.matcher("Linux; Android 6.0; Nexus;");
        boolean b= matcher.matches();
        //当条件满足时，将返回true，否则返回false
        System.out.println(b);

    }
}
