package mapper;



import pojo.Borrow;

import pojo.Book;
import java.util.List;

public interface BookMapper {
    public List<Book> selectBillList(Book book);
    public List<Book> selectBill2(Book book);
    public List<Book> selectById(String bookname ,String writer);
    public void insertBook(Book book);
    public void insertBorrow(Borrow borrow);
    public void deleteBook(Integer id);
    public void updateBook(Book book);
    public void updatePress(Book book);
}
