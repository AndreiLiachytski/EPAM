import java.io.FileNotFoundException;

public class Main {
    public static void main(final String[] args) throws FileNotFoundException {

        System.out.println(TextFile.createFile("example1.txt"));
        System.out.println(TextFile.deleteFile("example1.txt"));
    }
}
