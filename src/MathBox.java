

public class MathBox extends ObjectBox {

    MathBox(Number[] number) {
        super(number);
    }

    public Number summator() {
        Number sum = 0;

        for (Object object : super.objects) {
            Number number = (Number) object;
            if (sum instanceof Double || number instanceof Double) {
                sum = sum.doubleValue() + number.doubleValue();
            } else {
                sum = sum.longValue() + number.longValue();
            }
        }
        return sum;
    }

    public void splitter(double divider) {
        for (int i = 0; i < super.objects.size(); i++) {
            Number number = (Number) super.objects.get(i);
            if (number instanceof Double || number instanceof Float) {
                int previous = number.intValue();
                super.objects.set(i, (double)previous / divider);
            } else {
                long previous = number.longValue();
                super.objects.set(i, (long) (previous / divider));
            }
        }
    }

    @Override
    public void addObject(Object object) throws Exception {
        if(object instanceof Number){
            super.addObject(object);
        }
        else {
            throw new Exception("Argument is not instance of class Number");
        }
    }

    @Override
    public int hashCode() {
        if (super.objects == null)
            return 0;

        int result = 1;
        for (Object object : super.objects) {
            Number number = (Number) object;
            int elementHash = (int) (number.longValue() ^ (number.longValue() >>> 32));
            result = 31 * result + elementHash;
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != super.getClass()) {
            return false;
        }

        MathBox other = (MathBox) obj;
        if (other.objects.size() == super.objects.size()) {
            for (int i = 0; i < other.objects.size(); i++) {
                if (!other.objects.get(i).equals(super.objects.get(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
