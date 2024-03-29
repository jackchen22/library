package controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class Conteroller1 {
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/loginPage.action")
    public String loginpage() {
        return "login";
    }

    @RequestMapping("/login.action")
    public String login(User user, Model model) {
        HttpSession session = request.getSession ();
        User loginuser = userDao.login (user);
        if (loginuser != null) {
            session.setAttribute ("user", loginuser);
            return "frame";
        } else {
            model.addAttribute ("用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/userList.action")
    public ModelAndView userList(@RequestParam(required = false, defaultValue = "1", value = "page") int page, User user) {
        ModelAndView model = new ModelAndView ();
        List<User> users = userDao.selectUser (user);
        PageHelper.startPage (page, 5);
        PageInfo pageInfo = new PageInfo (users);
        model.addObject ("pageInfo", pageInfo);
        model.setViewName ("userList");
        return model;
    }

    @RequestMapping("/userView.action")
    public ModelAndView userView(String name) {
        ModelAndView mav = new ModelAndView ();
        User users = userDao.selectByname (name);
        mav.addObject ("user", users);
        mav.setViewName ("userList");
        return mav;
    }

    @RequestMapping("/userUpdata.action")
    public ModelAndView updateUser(String name) {
        ModelAndView mav = new ModelAndView();
        User user = userDao.selectByname (name);
        mav.addObject("user", user);
        mav.setViewName("userUpdate");
        return mav;
    }


    @RequestMapping("/userAdd.action")
    public ModelAndView insertBook(User user) {
        ModelAndView mav = new ModelAndView ();
        userDao.insertUser (user);
        List<User> userList = userDao.selectUser (user);
        mav.addObject ("userList", userList);
        mav.setViewName ("userList");
        return mav;
    }

    @RequestMapping("/updatePwd.action")
    public ModelAndView updatePwd() {
        ModelAndView mav = new ModelAndView ();
        mav.setViewName ("updatePwd");
        return mav;
    }

    @RequestMapping("/deleteUser.action")
    public ModelAndView deleteBook(@RequestParam(required = false, defaultValue = "1", value = "page") int page, Integer id) {
        ModelAndView mav = new ModelAndView ();
        PageHelper.startPage (page, 2);
        userDao.deleteUser (id);
        User user = null;
        List<User> userList = userDao.selectUser (user);
        PageInfo pageInfo = new PageInfo (userList);
        mav.addObject ("pageInfo", pageInfo);
        mav.setViewName ("userList");
        return mav;
    }
    @RequestMapping("/pwdUpdate.action")
    public ModelAndView pwdUpdate(@RequestParam(required = false, defaultValue = "1", value = "page") int page,User user) {
        ModelAndView mav = new ModelAndView();
        PageHelper.startPage(page, 2);
        userDao.pwdUpdate(user);
        User user1=null;
        List<User> userList = userDao.selectUser(user1);
        PageInfo pageInfo = new PageInfo(userList);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("userList");
        return mav;
    }

}