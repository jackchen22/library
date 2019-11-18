package service;

import pojo.Borrow;
import mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Book;
import java.util.List;


@Service
public class BookDaoImpl implements BookDao {

    @Autowired
    BookMapper bookMapper;


    @Override
    public List<Book> selectBillList(Book book) {
        return bookMapper.selectBillList (book);
    }

    @Override
    public List<Book> selectBill2(Book book) {
        return bookMapper.selectBill2 (book);
    }

    @Override
    public List<Book> selectById(String bookname, String writer) {
        return bookMapper.selectById (bookname,writer);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void insertBorrow(Borrow borrow) {
        bookMapper.insertBorrow(borrow);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook (id);
    }

    @Override
    public void updateBook(Book book) { bookMapper.updateBook (book);}

    @Override
    public void updatePress(Book book) {
        bookMapper.updatePress(book);
    }
}
