package pojo;

public class Book {
    Integer bookid;
    String bookname;
    String writer;
    String publishe;
    String press;
    User user;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublishe() {
        return publishe;
    }

    public void setPublishe(String publishe) {
        this.publishe = publishe;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", writer='" + writer + '\'' +
                ", publishe='" + publishe + '\'' +
                ", press='" + press + '\'' +
                ", user=" + user +
                '}';
    }
}
