package com.java.study.task2;

public class Main {
    public static void main(String[] args) {
        String s = "Last Christmas, I gave you my heart " +
                "But the very next day, you gave it away " +
                "This year, to save me from tears " +
                "I'll give it to someone special." +
                "Last Christmas, I gave you my heart " +
                "But the very next day, you gave it away (You gave it away) " +
                "This year, to save me from tears " +
                "I'll give it to someone special (Special)";
        StringBuilder stringBuilder = new StringBuilder(s);
        for (String temp: s.split("\\.", 2)) {
            System.out.println(temp);
        }
    }
}
