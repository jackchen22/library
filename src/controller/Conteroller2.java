package controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Borrow;
import pojo.User;
import service.BookDao;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class Conteroller2 {
  @Autowired
    BookDao bookDao;
 @RequestMapping("/billList.action")
public ModelAndView billList(){
   ModelAndView mav=new ModelAndView ();
   List<Book> bookList=bookDao.selectBillList ();
   mav.addObject("bookList",bookList);
   mav.setViewName("billList");
   return mav;
 }
  @RequestMapping("/bll2.action")
  public ModelAndView bill2(){
    ModelAndView mav=new ModelAndView();
    List<Book> books = bookDao.selectBill2();
    mav.addObject("books",books);
    mav.setViewName("bill2");
    return mav;
  }
  @RequestMapping("/billView.action")
  public ModelAndView billView(Integer id){
    ModelAndView mav = new ModelAndView();
    Book books = bookDao.selectById(id);
    mav.addObject("books",books);
    mav.setViewName("billView");
    return mav;
  }
  @RequestMapping(" /billAdd.action")
  public ModelAndView billAdd(){
    ModelAndView mav=new ModelAndView();
    mav.setViewName("billAdd");
    return mav;
  }
  @RequestMapping("/insertBook.action")
  public ModelAndView insertBook(Book book){
    ModelAndView mav=new ModelAndView();
    bookDao.insertBook(book);
    List<Book> billList = bookDao.selectBillList();
    mav.addObject("billList",billList);
    mav.setViewName("billList");
    return mav;
  }
  @RequestMapping("/deleteBook.action")
  public ModelAndView deleteBook(String id) {
    ModelAndView mav = new ModelAndView();
    Integer ID = Integer.parseInt(id);
    bookDao.deleteBook(ID);
    List<Book> bookList = bookDao.selectBillList();
    mav.addObject("bookList",bookList);
    mav.setViewName("billList");
    return mav;
  }
  @RequestMapping("/billUpdate.action")
  public ModelAndView billUpdate(Integer id) {
    ModelAndView mav = new ModelAndView();
    Book books = bookDao.selectById(id);
    mav.addObject("books", books);
    mav.setViewName("billUpdate");
    return mav;
  }
  @RequestMapping("/updateBook.action")
  public ModelAndView update(Book book){
    ModelAndView mav = new ModelAndView();
    bookDao.updateBook(book);
    List<Book> billList = bookDao.selectBillList();
    mav.addObject("billList",billList);
    mav.setViewName("billList");
    return mav;
  }
  @RequestMapping("/borrow.action")
  public ModelAndView borrow(Borrow borrow){
    ModelAndView mav = new ModelAndView();
    bookDao.insertBorrow(borrow);
    return mav;
  }
}
