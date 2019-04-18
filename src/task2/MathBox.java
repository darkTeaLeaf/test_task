package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class MathBox {
    ArrayList<Number> numbers;

    MathBox(Number[] number) {
        this.numbers = new ArrayList<>();

        this.numbers.addAll(Arrays.asList(number));
    }

    public Number summator() {
        int sum = 0;

        for (Number number : numbers) {
            sum += number.intValue();
        }

        return sum;
    }

    public void splitter(double divider) {
        for (int i = 0; i < this.numbers.size(); i++) {
            int previous = this.numbers.get(i).intValue();
            this.numbers.set(i, (int)(previous / divider));
        }
    }

    public void delete(int value){
        for (int i = 0; i < this.numbers.size(); i++) {
            if(value == this.numbers.get(i).intValue()){
                this.numbers.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString(){
        String object = "[" + this.numbers.get(0);

        for (int i = 1; i < this.numbers.size(); i++) {
            object += ", " + this.numbers.get(i);
        }

        object += "]";

        return object;
    }

    @Override
    public int hashCode(){
        if (this.numbers == null)
            return 0;

        int result = 1;
        for (Number element : this.numbers) {
            int elementHash = (int)(element.longValue() ^ (element.longValue() >>> 32));
            result = 31 * result + elementHash;
        }

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MathBox other = (MathBox) obj;
        if(other.numbers.size() == this.numbers.size()) {
            for (int i = 0; i < other.numbers.size(); i++) {
                if(!other.numbers.get(i).equals(this.numbers.get(i))){
                    return false;
                }
            }
        }else {
            return false;
        }

        return true;
    }
}
