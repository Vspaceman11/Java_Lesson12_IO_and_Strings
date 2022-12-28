package com.java.study.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Java_Lesson12_IO_and_Strings\\src\\com\\java\\study\\task1\\test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.println("Hello");
        printWriter.println("World");
        printWriter.close();

        String temp = null;
        while ((temp = bufferedReader.readLine()) != null){
            System.out.println(temp);
        }
        bufferedReader.close();
    }
}
