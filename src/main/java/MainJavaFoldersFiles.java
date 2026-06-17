import java.io.*;

public class MainJavaFoldersFiles {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
      //  /Users/kristinatomas-> MAC
        // C:\Users\750033-> Windows
        System.out.println(home);
        System.out.println(File.separator);
        //  / MAC
        // \ Windows
        String folderPath = home + File.separator + "myFolder";
        //               "/Users/kristinatomas" + "/" + "myFolder"
        //   folderPath = "/Users/kristinatomas/myFolder";Mac
        //   folderPath = "C:\Users\750033\myFolder";Windows

        File fld = new File(folderPath);
        fld.mkdirs();

        folderPath = home + File.separator + "1"  + File.separator  +"2";
        //folderPath ="/Users/kristinatomas/1/2   Mac
        //folderPath = "C:\Users\750033\1\2    Windows
        fld = new File(folderPath);
        //fld.mkdirs();
        //fld.delete();
        File test = new File(home);
        File[] files = test.listFiles();
        for (File f: files){
            System.out.println(f);
        }
        System.out.println("end");
    }
}
