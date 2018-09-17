import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Lab\\Files\\Files-and-Streams");

        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for (File f : files) {
                    if(!f.isDirectory()){
                        System.out.println(f + ": " + f.length());
                    }
                }
            }
        }
    }
}
