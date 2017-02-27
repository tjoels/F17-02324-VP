/**
 * Created by tjc on 2/27/2017.
 */
import java.io.File;
import java.util.Scanner;
import java.util.StringJoiner;

public class ReadDir {
    public static void main(String[] args) {

        File filePath = null;
        String[] paths;
        Scanner in;
        in = new Scanner(System.in);
        String inPath;
        inPath = in.nextLine();

        try{
            // create new filePath object
            filePath = new File(inPath);

            // array of files and directory
            paths = readdir(inPath);

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(NullPointerException e){
            System.out.println("filePath not found (NullPointerException)");
        }
        catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }

    private static String[] readdir(String str){
        File file;
        String[] path = null;
        try {
            // Create new file object
            file = new File(str);

            // string array of files amd folders
            path = file.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }
}
