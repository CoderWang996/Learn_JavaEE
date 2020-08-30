package com.itheima.controller;

import com.itheima.domain.Address;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

//带参请求
@Controller
@RequestMapping("/param")
public class ParamController {
    //获取前端数据
    @RequestMapping("test1")
    //设置默认请求参数且必须带参
    public String test1(@RequestParam(value = "name", defaultValue = "abc", required = true) String name, int age) {
        //输出前端请求参数
        System.out.println("name=" + name + "," + "age=" + age);
        System.out.println(age == 21);
        return "success";
    }

    //将前端数据封装到相应的对象中
    @RequestMapping("/test2")
    public String test2(User user) {
        //输出前端请求参数
        System.out.println(user);
/*        List<Address> list = user.getList();
        for (Address address : list) {
            System.out.println(address.getCity());
        }*/
        Map<String, Address> map = user.getMap();
        System.out.println(map);
        return "success";
    }

    //自定义类型转换
    @RequestMapping("/test3")
    public String test3(Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    //携带数据回到jsp页面以及服务器跳转
    //1.原生ServletAPI
    @RequestMapping("/test4")
    public String test4(HttpServletRequest request, HttpSession session) {
        request.setAttribute("username", "admin");
        session.setAttribute("pwd", "1123");
        return "main";
    }

    //ModelAndview (值存入请求域)
    @RequestMapping("/test5")
    public ModelAndView test5(ModelAndView modelAndView) {
        modelAndView.setViewName("main");
        modelAndView.addObject("username", "CoderWang");
        modelAndView.addObject("pwd", "1234");
        return modelAndView;
    }

    //Model (值存入请求域)
    @RequestMapping("/test6")
    public String test6(Model model) {
        model.addAttribute("username", "Renchen");
        return "main";
    }
    //Map(值存入请求域)
    @RequestMapping("/test7")
    public String test7(Map map) {
        map.put("username","Xuxi");
        return "main";
    }
    //Controller跳转Controller
    @RequestMapping("/test8")
    public String test8(Model model) {
        model.addAttribute("username", "Renchen");
        return "redirect:/param/test7";
    }
    //服务器跳转
    @RequestMapping("/test9")
    public String test9(Model model) {
        model.addAttribute("username", "Renchen");
        return "forward:/param/test7";
    }
}