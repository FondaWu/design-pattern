package creational.simplefactory.shape;

import common.Constant;
import creational.simplefactory.shape.AbstractShape;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        type = Constant.ShapeType.Rectangle;
    }

    @Override
    protected Boolean vertexsCheck(List<Point> vertexs) {

        return vertexs.size() == 2 && vertexs.get(1).x > vertexs.get(0).x && vertexs.get(1).y > vertexs.get(0).y;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("draw a rectangle with width ");
        sb.append(vertexs.get(1).x - vertexs.get(0).x);
        sb.append(" and height ");
        sb.append(vertexs.get(1).y - vertexs.get(0).y);
        System.out.println(sb.toString());
    }
}
