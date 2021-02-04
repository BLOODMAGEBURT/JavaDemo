package com.burt.pattern.decorator;

import java.awt.*;

public class Printer {
    public static void printHeader(String text) {
        System.out.println("printHeader:"+text);
    }

    public static void printFooter(String text) {
        System.out.println("printFooter:"+text);
    }

    public static void printText(String text) {
        System.out.println("printText:"+text);
    }

    public static void printTextWaterMark(String text) {
        System.out.println("printTextWaterMark:"+text);
    }

    public static void printImgWaterMark(Image logo) {
        System.out.println("printImgWaterMark:");
    }

}
