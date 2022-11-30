import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try (FileReader fileReader = new FileReader("txt")) {
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()){
                counter++;
                System.out.println(counter+": "+scanner.nextLine());
            }

        }catch (IOException e){
            System.err.println("No such file!!");
        }

//        fileWriter();
    }

    private static void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("txt")){
            for (char c = 'A',i = 'a'; c<='Z';c++,i++) {
                fileWriter.write(c+" "+i+"\n");
            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i+"\n");

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}