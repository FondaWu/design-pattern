package common;

/**
 * Created by fondawu on 2019/3/21.
 */
public class Constant {

    public enum ShapeType {
        Segment(0),
        Rectangle (1),
        Polygon (2);

        private final Integer value;

        public Integer value() {
            return this.value;
        }

        ShapeType(Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return Integer.toString(this.value);
        }

    }

}
