package com.burt.pattern.decorator;

import java.awt.*;

public class Printer {
    public static void printHeader(String header) {
        System.out.println("printHeader:"+header);
    }

    public static void printFooter(String footer) {
        System.out.println("printFooter:"+footer);
    }

    public static void printText(String text) {
        System.out.println("printText:"+text);
    }

    public static void printTextWaterMark(String textMark) {
        System.out.println("printTextWaterMark:"+textMark);
    }

    public static void printImgWaterMark(Image logo) {
        System.out.println("printImgWaterMark:");
    }

}
