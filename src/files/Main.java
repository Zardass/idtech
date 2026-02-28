package files;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //create();
        bufferedWrite();
        //bufferedRead();
        Path path = Paths.get("//src/files/test.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.isAbsolute());
//        BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile()));
//        bw.write("test");
//        bw.close();
    }

    public static void create() throws IOException {
        FileWriter fileWriter = new FileWriter("src/files/test.txt", true);
        fileWriter.append("hello").append(" worlds");
        fileWriter.close();
    }

    public static void normalRead() throws IOException {
        FileReader fileReader = new FileReader("src/files/test.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char) read);
        }
        fileReader.close();
    }

    public static void bufferedRead() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("src/files/test.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            //System.out.print(fileReader.readLine());
            System.out.println(line);
        }
        fileReader.close();
    }

    public static void bufferedWrite(){
        try (BufferedWriter filewriter =  new BufferedWriter(new FileWriter("src/files/test.txt"))){
            filewriter.append("salam").append("\nnecesen?");
        }
        catch (IOException e) {
            System.out.println("an error occured" + e.getMessage());
        }
    }
}