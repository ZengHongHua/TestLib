package com.example.nativedemo;

public class NumNative {

    static {
        //此处加载so文件不要带有前缀lib，和后缀名 .so，系统自动加
        System.loadLibrary("num");
    }

    public native int getSumFromC(int age,int high);

}
