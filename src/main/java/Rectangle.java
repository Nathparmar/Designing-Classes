public class Rectangle {

    private int length;
    private int width;

    private int area;


    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }
//methods
    public int getArea(){
        return length*width;
    }

//    Getters

     public int getLength(){
        return this.length;

     }public int getWidth(){
        return this.width;
     }

     public boolean getSquare(){
        return (length == width);
     }


}
