package creational.simplefactory;

import common.Constant;
import creational.simplefactory.factory.ShapeFactory;
import creational.simplefactory.shape.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Segment 的对象，并调用它的 draw 方法
        List<Point> vertexs1 = new ArrayList<>();
        vertexs1.add(new Point(100, 100) );
        vertexs1.add(new Point(200, 200) );
        creational.simplefactory.shape.Shape segment = shapeFactory.create(Constant.ShapeType.Segment, vertexs1);
        segment.draw();

        // 获取 Polygon 的对象，并调用它的 draw 方法
        List<Point> vertexs2 = new ArrayList<>();
        vertexs2.add(new Point(100, 100) );
        vertexs2.add(new Point(200, 200) );
        vertexs2.add(new Point(300, 300) );
        creational.simplefactory.shape.Shape polygon = shapeFactory.create(Constant.ShapeType.Polygon, vertexs2);
        polygon.draw();

        // 获取 Polygon 的对象，并调用它的 draw 方法
        List<Point> vertexs3 = new ArrayList<>();
        vertexs3.add(new Point(100, 100) );
        vertexs3.add(new Point(200, 200) );
        Shape rectangle = shapeFactory.create(Constant.ShapeType.Rectangle, vertexs3);
        rectangle.draw();
    }

    private static void createSegment() {

    }
}
