package com.StringsComparatorsFilters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListSelectFiles {
    
    public static void main(String[] args) throws IOException {
        // bad version
        final String[] files =
                new File("fpij").list((dir, name) -> name.endsWith(".java"));
        System.out.println(files);
        
        //cool version, display only .java files in directory
        Files.newDirectoryStream(
            Paths.get("fpij"), path -> path.toString().endsWith(".java"))
             .forEach(System.out::println);
        
    }
}
