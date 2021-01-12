import java.io.*;

class TextFile {

    public static boolean createFile(final String directoryName, final String fileName) {
        final File directory = new File(directoryName);
        final File file = new File(directory.getAbsolutePath(), fileName);
        boolean bool = false;

        try {
            bool = file.createNewFile();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return bool;
    }

    public static boolean createFile(final String fileName) {
        final File file = new File(fileName);
        boolean bool = false;

        try {
            bool = file.createNewFile();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return bool;
    }

    public static boolean renameFile(final String oldFileName, final String fileName) {
        final File file = new File(oldFileName);
        final File newFile = new File(fileName);
        return file.renameTo(newFile);
    }

    public static void printFile(final String fileName) throws FileNotFoundException {
        final File file = new File(fileName);
        final char[] array = new char[1024];

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            int cell = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (cell > 0) {
                result.append(new String(array));
                cell = reader.read(array);
            }
            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addInformation(final String fileName, final String information) throws FileNotFoundException {
        final File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(information.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cleanFile(final String fileName) throws FileNotFoundException {
        final File file = new File(fileName);
        final String information = "";

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(information.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteFile(final String fileName) {
        final File file = new File(fileName);
        return file.delete();
    }

    public static boolean deleteFile(final String directoryName, final String fileName) {
        final File directory = new File(directoryName);
        final File file = new File(directory.getAbsolutePath(), fileName);
        return file.delete();
    }
}
