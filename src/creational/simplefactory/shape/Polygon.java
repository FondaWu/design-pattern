package creational.simplefactory.shape;

import common.Constant;
import creational.simplefactory.shape.AbstractShape;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public class Polygon extends AbstractShape {

    public Polygon() {
        type = Constant.ShapeType.Polygon;
    }

    @Override
    protected Boolean vertexsCheck(List<Point> vertexs) {
        return vertexs.size() > 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("draw a Polygon with vertexs ");
        sb.append(vertexs.toString());
        System.out.println(sb.toString());
    }
}
