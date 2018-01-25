package com.munis.iostreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mnagarat on 1/25/18.
 */
public class WritingBytes {

    public static void main(String[] args){

        String pathname = "files/ints.bin";
        File file = new File(pathname);

        try(OutputStream os = new FileOutputStream(file);){
            DataOutputStream dos = new DataOutputStream(os);

//            dos.writeDouble(10);
//            dos.writeInt(5);
            dos.writeUTF("Hello");
        }catch(IOException e){
            e.printStackTrace();
        }

        Path path = Paths.get(pathname);
        try {
            Files.size(path);
            long size = Files.size(path);
            System.out.println(path + " size : " + size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

