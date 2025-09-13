import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) {
//        File file = new File("Demo.txt");
 /*       try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File Not created");
            e.printStackTrace();
        }
*/        //Write into a file

        /*    try {
                FileWriter  fileWriter= new FileWriter("Demo.txt");
                fileWriter.write("This is Demo Text");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/

        // Reading File

      /*  File file1=new File("Test.txt");
        try {
          Scanner  sc = new Scanner(file1);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        // Delete File

        File file=new File("Test.txt");
        if (file.delete()){
            System.out.println("Successfully Deleted");
        }else {
            System.out.println("File Not Deleted");
        }

    }
}
