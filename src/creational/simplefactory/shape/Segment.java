package creational.simplefactory.shape;

import common.Constant;
import creational.simplefactory.shape.AbstractShape;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public class Segment extends AbstractShape {

    public Segment() {
        type = Constant.ShapeType.Segment;
    }

    @Override
    protected Boolean vertexsCheck(List<Point> vertexs) {
        return vertexs.size() == 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("draw a segment from ");
        sb.append(vertexs.get(0).toString());
        sb.append(" to ");
        sb.append(vertexs.get(1).toString());
        System.out.println(sb.toString());
    }
}
