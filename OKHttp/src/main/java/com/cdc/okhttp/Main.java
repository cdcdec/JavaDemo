package com.cdc.okhttp;
public class Main {
    private static final String PATH_1="https://api.github.com/users/cdcdec";
    private static final String PATH_2="http://www.roundsapp.com/post";
    public static void main(String[] strings){
        OKHttp okHttp=new OKHttp();
        P.L(okHttp.getExample1(PATH_1));
        P.L(okHttp.postExample1(PATH_2));
        P.L(okHttp.getExample2(PATH_1));
    }
}
