public class Main {

    public static void main(String[] args) throws Exception {
        Number[] array = {1, 5.5, 30, 6, 47};
        MathBox box = new MathBox(array);

        System.out.println(box.toString());

        System.out.println(box.summator());

        box.splitter(3);

        System.out.println(box.toString());

        box.deleteObject(10);

        System.out.println(box.toString());

        Number[] array2 = {0, 1, 2, 15};
        MathBox box2 = new MathBox(array2);

        System.out.println(box.equals(box2));

        System.out.println("Box hash: " + box.hashCode());
        System.out.println("Box2 hash: " + box2.hashCode());

        Object ob = new Object();
        box.addObject(ob);
    }
}
