package sec2;

import sec01.*;

public class ChunjaeEx1 {
    public static void main(String[] args) {
        Chunjae[] chunjaes = new Chunjae[10];
        for(int i=0; i<chunjaes.length; i++){
            chunjaes[i] = new Chunjae();
            chunjaes[i].setNum(i+1);
            chunjaes[i].setData("천재"+(i+1));
            System.out.println(chunjaes[i].getData()+": "+chunjaes[i].getNum());

        }
    }
}
