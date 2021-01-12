package treasureServis;

import model.Treasure;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static List<Treasure> read() {
        List<Treasure> list = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream("treasure.tr")))) {
            list =  (List<Treasure>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
