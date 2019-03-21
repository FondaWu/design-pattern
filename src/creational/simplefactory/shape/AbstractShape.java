package creational.simplefactory.shape;

import common.Constant;

import java.awt.*;
import java.util.List;

/**
 * Created by fondawu on 2019/3/21.
 */
public abstract class AbstractShape implements Shape {

    protected Constant.ShapeType type;
    protected List<Point> vertexs;

    public Constant.ShapeType getType(){
        return type;
    }

    public void setVertexs(List<Point> vertexs) throws Exception {
        if (!vertexsCheck(vertexs))
            throw new Exception("设置不合法的顶点!");

        this.vertexs = vertexs;
    }

    protected Boolean vertexsCheck(List<Point> vertexs) {
        return vertexs.size() > 0;
    }

    public List<Point> getVertexs(){
        return vertexs;
    }

}
