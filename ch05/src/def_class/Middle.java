package def_class;

public class Middle extends Score {
    private int history;

    public Middle() {
        super();
    }
    public int getHistory() {
        return history;
    }
    public void setHistory(int history) {
        this.history = history;
    }

    public void totalNum(){
        System.out.println(super.getEng()+this.history);
    }
}
