package com.StringsComparatorsFilters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ListHiddenFiles {
    
    public static void listHardWay() {
        List<File> files = new ArrayList<>();
        
        File[] filesInCurrentDir = new File(".").listFiles();
        for (File file : filesInCurentDir) {
            File[] filesInSubDir = file.listFiles();
            if (filesInSubDir != null) {
                files.addAll(Arrays.asList(filesInSubDir));
            }
            else {
                files.add(file);
            }
        }
        System.out.println("Count: " + files.size());
    }
    
    public static void betterWay() {
        List<File> files =
            Stream.of(new File(".").listFiles())
                  .flatMap(file -> file.listFiles() == null ?
                                   Stream.of(file) : Stream.of(file.listFiles()))
                  .collect(toList());
        System.out.println("Count: " + files.size());
        
    }
    
    public static void watchFileChange() throws IOException {
        final Path path = Paths.get(".");
        final WatchService watchService =
            path.getFileSystem()
                .newWatchService();
    
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
    }
    
    public static void main(String[] args) {
        final File[] files = new File(".").listFiles(File::isHidden);
    }
}
