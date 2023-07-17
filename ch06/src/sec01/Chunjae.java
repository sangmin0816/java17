package sec01;

class Babo{// 생성자
    private int seq;
    private int data;
    public Babo() {
    }

    public Babo(int seq) {
        this.seq = seq;
    }

    public Babo(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }

    public int getSeq() {
        return seq;
    }

    public int getData() {
        return data;
    }
}

public class Chunjae {
    private int num;
    private String data;

    public Chunjae() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }


}
