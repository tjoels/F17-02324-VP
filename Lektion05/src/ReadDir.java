/**
 * Created by tjc on 2/27/2017.
 */
import java.io.File;
import java.util.Scanner;

public class ReadDir {
    public static void main(String[] args) {

        File file = null;
        String[] paths;
        Scanner in;
        in = new Scanner(System.in);
        String inPath;
        inPath = in.nextLine();

        try{
            // create new file object
            file = new File(inPath);

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths)
            {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(NullPointerException e){
            System.out.println("Path not found (NullPointerException)");
        }
        catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }
    }
}
