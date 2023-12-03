//64050030 นาย กิติภูมิ หน่อเนื้อ
package oop1_2_64050030;

public class FootShape {
    private Ellipse ellipse;
    private Rectangle rectangle; 

    public FootShape(Ellipse ellipse,Rectangle rectangle){
        this.ellipse = ellipse;
        this.rectangle = rectangle;
    }
    public void drawAsEllipse(){
        ellipse.draw();
    }

    public void drawAsRectangle(){
        rectangle.draw();
    }
}
