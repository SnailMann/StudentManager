package com.snailmann.controller;

import com.snailmann.po.StudentCustom;
import com.snailmann.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/StudentCustom")
public class TeacherController {
    String userType;
    Integer userid;

    @Autowired
    private TeacherService studentCustomService;

    /**
     * 查询所有学生信息
     * /StudentCustom/queryStudentCustom.action
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryStudentCustom")
    public ModelAndView queryStudentCustom(HttpSession session) throws Exception {

        List<StudentCustom> studentCustomList = new ArrayList<StudentCustom>();
        ModelAndView modelAndView = new ModelAndView();
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");
        studentCustomList = studentCustomService.findStudentCustomList(null);
        modelAndView.addObject("studentCustomList", studentCustomList);
        // 调用service查找 数据库

        System.out.println("query:" + userType);
        // 返回ModelAndView

        // 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
        modelAndView.addObject("userType", userType);
        modelAndView.addObject("userid", userid);
        // 指定视图

        modelAndView.setViewName("teacher/studentlist");
        return modelAndView;

    }

    /**
     * 根据ID查询学生信息，点击修改时获得
     * /StudentCustom/editStudentCustom.action
     * @param studentCustom
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/editStudentCustom")
    public ModelAndView editStudentCustom(StudentCustom studentCustom, HttpSession session) throws Exception {
        studentCustom = studentCustomService.findStudentById(studentCustom.getId());
        ModelAndView modelAndView = new ModelAndView();
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");

        modelAndView.addObject("Student", studentCustom);
        modelAndView.addObject("userType", userType);
        modelAndView.addObject("userid", userid);
        modelAndView.setViewName("teacher/studentupdate");

        return modelAndView;

    }

    /**
     * 提交修改学生信息操作
     * /StudentCustom/editStudentCustomSubmit.action
     *
     * @param model
     * @param studentCustom
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/editStudentCustomSubmit")
    public String editStudentCustomSubmit(Model model, StudentCustom studentCustom, HttpSession session) throws Exception {
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");
        model.addAttribute("userType", userType);
        model.addAttribute("userid", userid);
        studentCustomService.updateStudentCustom(studentCustom);
        return "redirect:/StudentCustom/queryStudentCustom.action";

    }

    /**
     * 删除学生信息
     * 这里也可以不定义StudentCustom studentCustom，可以定义Integer id,下面 deleteStudentCustom(id),也可以实现
     * /StudentCustom/deleteStudentCustom.action
     * @param model
     * @param studentCustom
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteStudentCustom")

    public String deleteStudentCustom(Model model, StudentCustom studentCustom, HttpSession session) throws Exception {
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");
        model.addAttribute("userType", userType);
        model.addAttribute("userid", userid);
        studentCustomService.deleteStudentCustom(studentCustom.getId());
        return "redirect:/StudentCustom/queryStudentCustom.action";

    }

    /**
     * 点击新增加按钮，因为studentinsert在WEB-INF目录下，不允许客户端执行，只允许服务端执行
     * 所以通过Controllor来访问studentinsert.jsp
     * /StudentCustom/insertWeb.action
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/insertWeb")
    public ModelAndView insertWeb(HttpSession session) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");
        modelAndView.addObject("userType", userType);
        modelAndView.addObject("userid", userid);
        modelAndView.setViewName("teacher/studentinsert");

        return modelAndView;

    }

    /**
     * 提交插入学生信息操作
     * StudentCustom/insertStudentCustom.action
     *
     * @param model
     * @param studentCustom
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/insertStudentCustom")
    public String insertStudentCustom(Model model, StudentCustom studentCustom, HttpSession session) throws Exception {
        userType = (String) session.getAttribute("userType");
        userid = (Integer) session.getAttribute("userid");
        model.addAttribute("userType", userType);
        model.addAttribute("userid", userid);
        studentCustomService.insertStudentCustom(studentCustom);
        return "redirect:/StudentCustom/queryStudentCustom.action";

    }


}
