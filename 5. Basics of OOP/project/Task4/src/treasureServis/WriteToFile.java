package treasureServis;

import model.Treasure;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteToFile {

    public static boolean write(List<Treasure> list) {
        boolean result = false;
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("treasure.tr"))) {
            objectOutputStream.writeObject(list);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
