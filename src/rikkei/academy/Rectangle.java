package rikkei.academy;

public class Rectangle {
    int width, height;
    public Rectangle(){

    }
    public Rectangle(int w,int h){
        this.width = w;
        this.height = h;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }



    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
