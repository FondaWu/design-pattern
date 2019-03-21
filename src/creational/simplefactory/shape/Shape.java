package creational.simplefactory.shape;

import common.Constant;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public interface Shape {

    Constant.ShapeType getType();

    void setVertexs(List<Point> vertexs) throws Exception;

    List<Point> getVertexs();

    void draw();

}
