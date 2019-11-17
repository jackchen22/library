package service;



import pojo.Borrow;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {
    public List<Book> selectBillList(Book book);
    public List<Book> selectBill2(Book book);
    public Book selectById(Integer id);
    public void insertBook(Book book);
    public void insertBorrow(Borrow borrow);
    public void updatePress(Book book);
    public void deleteBook(Integer id);
    public void updateBook(Book book);
}
