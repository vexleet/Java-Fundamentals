import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("D:\\Java-Fund\\Java-Advanced\\Files-And-Directories\\Exercise\\Resources\\Exercises-Resources");

        long fileSize = file.length();

        System.out.println("Folder size: " + fileSize);
    }
}
