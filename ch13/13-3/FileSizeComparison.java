/* this symbol locks this original problem

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile = Paths.get("/root/sandbox/lyric1.txt");
        Path wordFile = Paths.get("/root/sandbox/lyric2.txt");
        // Write your code here
    }
}
{

symbol to the right unlocks the bottom section */

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile = Paths.get("C:\\Users\\Sonic\\IdeaProjects\\mindtap\\src\\lyric1.txt");
        Path wordFile = Paths.get("C:\\Users\\Sonic\\IdeaProjects\\mindtap\\src\\lyric2.txt");
        try {
            BasicFileAttributes paper = Files.readAttributes(textFile, BasicFileAttributes.class);
            System.out.println("testFile size is " + paper.size());
        } catch (IOException e) {
            System.out.println("error");
        }
        try {
            BasicFileAttributes paper2 = Files.readAttributes(wordFile, BasicFileAttributes.class);
            System.out.println("wordFile size is " + paper2.size());
        } catch (IOException e) {
            System.out.println("error");
        }
        try {
            BasicFileAttributes paper = Files.readAttributes(textFile, BasicFileAttributes.class);
            BasicFileAttributes paper2 = Files.readAttributes(wordFile, BasicFileAttributes.class);
            double a = paper.size();
            double b = paper2.size();
            System.out.println((a / b * 100) + "%");
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
