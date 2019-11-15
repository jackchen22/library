package pojo;



public class User {
    Integer id;
    String name;
    String account;
    String password;
    String firmpassword;
    String sex;
    String date;
    String tel;
    String address;
    String root;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirmpassword() {
        return firmpassword;
    }

    public void setFirmpassword(String firmpassword) {
        this.firmpassword = firmpassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", firmpassword='" + firmpassword + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", root='" + root + '\'' +
                '}';
    }
}
