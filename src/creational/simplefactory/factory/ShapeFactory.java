package creational.simplefactory.factory;

import common.Constant;
import creational.simplefactory.shape.Segment;
import creational.simplefactory.shape.Shape;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public class ShapeFactory {
    public creational.simplefactory.shape.Shape create(Constant.ShapeType shapeType, List<Point> vertexs) throws Exception {
        if (shapeType == null){
            return null;
        }

        Shape shape = null;
        if (shapeType.equals(Constant.ShapeType.Segment)){
            shape = new Segment();
        }
        if (shapeType.equals(Constant.ShapeType.Polygon)){
            shape = new creational.simplefactory.shape.Polygon();
        }
        if (shapeType.equals(Constant.ShapeType.Rectangle)){
            shape = new creational.simplefactory.shape.Rectangle();
        }
        shape.setVertexs(vertexs);

        return shape;
    }
}
