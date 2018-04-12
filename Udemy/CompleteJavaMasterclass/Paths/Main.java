package com.karmen;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path pathOfFileToBeCreated = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Files.createFile(pathOfFileToBeCreated);

            Path pathOfFileToBeCopied = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path destinationPath = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.copy(pathOfFileToBeCopied, destinationPath);

            Path pathOfFileToBeMoved = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            destinationPath = FileSystems.getDefault().getPath("Examples", "file1copyMoved.txt");
            Files.move(pathOfFileToBeMoved, destinationPath);

            Path pathOfFileToBeDeleted = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
            Files.deleteIfExists(pathOfFileToBeDeleted);

            pathOfFileToBeDeleted = FileSystems.getDefault().getPath("Examples", "file1copyMoved.txt");
            Files.deleteIfExists(pathOfFileToBeDeleted);

            pathOfFileToBeDeleted = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Files.deleteIfExists(pathOfFileToBeDeleted);

            //            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

//        Path path = File
//        Systems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//        Path filePath = Paths.get(".", "files", "SubdirectoryFile.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path1 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path1.normalize().toAbsolutePath());
//
//        System.out.println("Does the file: " + path.toString() + " exists? Ans: " + Files.exists(path));
// }

//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
