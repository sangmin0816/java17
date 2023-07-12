package sec1;

public class Example3 {
    public static String[] add(String[] originArr, String txt){
        String[] newArr = new String[originArr.length+1];
        for(int i=0; i<originArr.length; i++){
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt;
        return newArr;
    }
    public static String[] remove(String[] originArr){
        String[] newArr = new String[originArr.length-1];
        for(int i=0; i<originArr.length-1; i++){
            newArr[i] = originArr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        String[] originArr = {"김일일"};
        originArr = add(originArr, "김이이");
        originArr = add(originArr, "김삼삼");
        originArr = new String[]{"", ""};
        originArr = add(originArr, "김사사");
        originArr = add(originArr, "김오오");
        originArr = remove(originArr);
        for(String i:originArr){
            System.out.print(i+" ");
        }
    }
}
