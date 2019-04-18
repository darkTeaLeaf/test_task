import java.util.ArrayList;
import java.util.Arrays;

public class ObjectBox {
    ArrayList<Object> objects;

    ObjectBox(Object[] objects) {
        this.objects = new ArrayList<>();

        this.objects.addAll(Arrays.asList(objects));
    }

    public void addObject(Object object) throws Exception {
        this.objects.add(object);
    }

    public void deleteObject(Object object) {
        this.objects.remove(object);
    }

    @Override
    public String toString() {
        String string = "[" + this.objects.get(0).toString();

        for (int i = 1; i < this.objects.size(); i++) {
            string += ", " + this.objects.get(i).toString();
        }

        string += "]";

        return string;
    }
}
