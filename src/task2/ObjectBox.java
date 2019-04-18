package task2;

import java.util.ArrayList;

public class ObjectBox {
    private ArrayList<Object> objects;

    public void addObject(Object object) {
        this.objects.add(object);
    }

    public void deleteObject(Object object) {
        this.objects.remove(object);
    }

    public String dump() {
        String string = "[" + this.objects.get(0).toString();

        for (int i = 1; i < this.objects.size(); i++) {
            string += ", " + this.objects.get(i).toString();
        }

        string += "]";

        return string;
    }
}
