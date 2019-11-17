package service;

import pojo.Borrow;
import mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
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
    public Book selectById(Integer id) {
        return bookMapper.selectById (id);
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
    public void updatePress(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
bookMapper.deleteBook (id);
    }

    @Override
    public void updateBook(Book book) {
bookMapper.updateBook (book);
    }
}
