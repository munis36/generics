package com.munis.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by MN883H on 1/22/2018.
 */
public class NewJava {
    public static void main(String[] args) throws Exception{
        /*FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };*/

        FileFilter endsWithJava = file->file.getName().endsWith(".java");

        File dir = new File("c:/JavaWeb/Generics/src/main/java/com/munis/lambda");
        File[] javaFiles = dir.listFiles(endsWithJava);
        System.out.println("Writing file names");
        for (File f : javaFiles) {
            System.out.println(f.getName());
        }


        List<String> strings = Arrays.asList("One","Two","Three","Four","Five");

        Consumer<String> c1 = System.out::println;

        strings.forEach(c1);


    }
}
