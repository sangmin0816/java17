package def_class;

public class Member {
    private String id;
    private String pw;
    private String birth;
    private String tel;
    private String email;

    public Member() {
        this("idid");
    }

    public Member(String id) {
        this(id, "****");
    }
    
    public Member(String id, String pw) {
        this(id, pw, "2023-07-14");
    }

    public Member(String id, String pw, String birth) {
        this(id, pw, birth, "010-1111-2222");
    }

    public Member(String id, String pw, String birth, String tel) {
        this(id, pw, birth, tel, "@gmail.com");
    }

    public Member(String id, String pw, String birth, String tel, String email) {
        this.id = id;
        this.pw = pw;
        this.birth = birth;
        this.tel = tel;
        this.email = email;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getBirth() {
        return birth;
    }
    public String getEmail() {
        return email;
    }
    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }
    public String getTel() {
        return tel;
    }
}
