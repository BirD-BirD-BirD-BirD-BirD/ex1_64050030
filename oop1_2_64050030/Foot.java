//64050030 นาย กิติภูมิ หน่อเนื้อ
package oop1_2_64050030;

import java.util.Scanner;

public class Foot{
    
    private FootShape footShape;
    public Foot(FootShape footShape){
        this.footShape = footShape;
    }

    public static String getFootShapeFromUser(){
        String footShape = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1.Ellipse , 2.Rectangle ");
        int type = inp.nextInt();
        switch(type){
            case 1:
                footShape = "Ellipse";
                break;
            case 2:
                footShape = "Rectangle";
                break;
        }
        return footShape;
    }

    public void draw(String footshape){
        switch(footshape){
            case "Ellipse":
                footShape.drawAsEllipse();
                break;
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
        }
    }
    public static void main(String args[]){
        String footShapeFromUser = getFootShapeFromUser();
        FootShape footshape = new FootShape(new Ellipse(), new Rectangle());
        Foot foot = new Foot(footshape);
        foot.draw(footShapeFromUser);
    }
}
