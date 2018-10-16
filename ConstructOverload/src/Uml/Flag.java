package Uml;

public class Flag {
    private int height;
    private int width;
    private String color;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public  void setData(int height, int width, String color){
        this.height = height;
        this.width = width;
        this.color = color;

        }

    public  void display(){
        System.out.println("Flag height:"+getHeight());
        System.out.println("Flag width: "+getWidth());
        System.out.println("Flag color: "+getColor());
    }
}
