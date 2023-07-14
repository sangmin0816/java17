package sec1;

public class Shape {
    public String type;
    public int len;
    public double area;
    private int height;

    public Shape(){

    }
    // setMethod: 
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getHeight(){
        return this.height;
    }

    public Shape(String type, int len){
        this.type = type;
        this.len = len;
    }

    // 멤버 메소드(Memeber Method)
    public double calc_area(){
        if(this.type.equals("square")){
            this.area = this.len*this.len;
        }
        else if(this.type.equals("circle")){
            this.area = this.len*this.len*3.14f;
        }
        else if(this.type.equals("triangel")){
            this.area = this.len*10/2;
        }
        else{
            this.area = 0.0f;
        }
        return this.area;
    }
}