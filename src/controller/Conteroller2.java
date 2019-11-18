package controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.Borrow;
import pojo.User;
import service.BookDao;

import pojo.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class Conteroller2 {
  @Autowired
    BookDao bookDao;
    @Autowired
    HttpServletRequest httpServletRequest;
 @RequestMapping("/billList.action")
public ModelAndView billList(@RequestParam(required = false,defaultValue = "1",value = "page")int page,Book book){
   ModelAndView mav=new ModelAndView();
     PageHelper.startPage(page,5);
     List<Book> books=bookDao.selectBillList (book);
     PageInfo pageInfo=new PageInfo(books);
   mav.addObject("pageInfo",pageInfo);
   mav.setViewName("billList");
   return mav;
 }
  @RequestMapping("/bill2.action")
  public ModelAndView bill2(Book book){
    ModelAndView mav=new ModelAndView();
    List<Book> books = bookDao.selectBill2(book);
    mav.addObject("books",books);
    mav.setViewName("bill2");
    return mav;
  }
  @RequestMapping("/billView.action")
  public ModelAndView billView(@RequestParam(required = false,defaultValue = "1",value = "page")int page,String bookname, String writer){
    ModelAndView mav = new ModelAndView();
//      PageHelper.startPage(page,5);
    List<Book> books = bookDao.selectById(bookname,writer);
      PageInfo pageInfo=new PageInfo(books);
    mav.addObject("pageInfo",pageInfo);
    mav.setViewName("billList");
    return mav;
  }


  @RequestMapping("/insertBook.action")
  public ModelAndView insertBook(Book book){
    ModelAndView mav=new ModelAndView();
    bookDao.insertBook(book);
    List<Book> billList = bookDao.selectBillList(book);
    mav.addObject("billList",billList);
    mav.setViewName("billList");
    return mav;
  }
  @RequestMapping("/deleteBook.action")
  public String deleteBook(Model model,Integer bookid) {
        bookDao.deleteBook (bookid);
    return "billList";
  }
  @RequestMapping("/billUpdate.action")
  public ModelAndView billUpdate(String bookname,String writer) {
    ModelAndView mav = new ModelAndView();
    List<Book> books= bookDao.selectById(bookname,writer);
    mav.addObject("books", books);
    mav.setViewName("billUpdate");
    return mav;
  }
  @RequestMapping("/updateBook.action")
  public ModelAndView update(Book book){
    ModelAndView mav = new ModelAndView();
    bookDao.updateBook (book);
    Book book1=null;
    List<Book> billList = bookDao.selectBillList (book);
    mav.addObject("billList",billList);
    mav.setViewName("billList");
    return mav;
  }
    @RequestMapping("/borrow.action")
    public ModelAndView borrow(String bookid){
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        Integer userId=user.getId();
        Integer bookId= Integer.parseInt(bookid);
        Borrow borrow=new Borrow();
        borrow.setBook_id(bookId);
        borrow.setUser_id (userId);
        ModelAndView mav = new ModelAndView();
        Book book=new Book();
        book.setBookid (bookId);
        bookDao.insertBorrow(borrow);
        bookDao.updatePress(book);
        Book book1 = null;
        List<Book> books = bookDao.selectBill2(book1);
        mav.addObject("books",books);
        mav.setViewName("bill2");
        return mav;
    }
}
