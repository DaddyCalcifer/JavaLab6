package com.example.task1;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;
import javafx.scene.paint.Color;

public class ShapeCell extends ListCell<Shape> {
    @Override
    public void updateItem(Shape item, boolean empty) {

        super.updateItem(item, empty);

        if (item != null) {
            Canvas cnv=new Canvas();
            cnv.setHeight(60);
            cnv.setWidth(60);

            GraphicsContext gr=cnv.getGraphicsContext2D();

            Shape item1=(Shape)item.clone();
            item1.setWH(50,50);
            item1.setXY(0,0);
            item1.setColor(Color.BLACK);
            item1.draw(gr);
            setGraphic(cnv);
        }

    }
}
