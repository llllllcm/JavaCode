package com.example.demo.controller;

import com.example.demo.entity.Userinfo;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

//@Controller
//@ResponseBody
// 使用以上两个注解或者直接使用RestController去返回一个数据,
@RestController
//@RequestMapping(value = "/say",method = RequestMethod.POST)

public class UserController {

    /**
     * 获取对象
     * @param userinfo
     * @return
     */
    @RequestMapping("/reg")
    public Object reg(Userinfo userinfo) {
        System.out.println(userinfo);
        return userinfo;
    }
    @RequestMapping("/reg2")
    public Object reg2(@RequestParam(value = "username",required = false) String name,String password) {
        return name+": "+password;
    }

    /**
     * 获取JSON格式对象
     * @param userinfo
     * @return
     */
    @RequestMapping("/reg3")
    public Object reg3(@RequestBody Userinfo userinfo) {
        System.out.println(userinfo);
        return userinfo;
    }

    /**
     * 获取URL参数(?之前的参数)
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/reg4/{name}/{pwd}")
    public Object reg4(@PathVariable String name,@PathVariable(value = "pwd",required = false) String password) {
        return "say Hi "+name+" 密码是: "+password;
    }


    @RequestMapping("/upload")
    public Object upload(@RequestPart("img") MultipartFile file) {
        String fileName = UUID.randomUUID() + //获取文件名
                file.getOriginalFilename().substring(  //获取文件后缀
                        file.getOriginalFilename().lastIndexOf("."));

        File saveFile = new File("C:\\Users\\86136\\Desktop\\"+fileName);
        try {
            file.transferTo(saveFile);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 获取多个Cookie
     * @param response
     * @param request
     * @return
     */
    @RequestMapping("/getCookies")
    public String getCookies(HttpServletResponse response,HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        return cookies.toString();//无实际意义，只是为了不报错
    }

    /**
     * 获取单个Cookie
     * @param a
     * @return
     */
    @RequestMapping("/getCookie")
    public Object getCookie(@CookieValue(required = false) String a) {
        return a;
    }

    /**
     * 获取header1
     * @param response
     * @param request
     * @return
     */
    @RequestMapping("/getHeader")
    public Object getHeader(HttpServletResponse response,HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        return userAgent;
    }
    @RequestMapping("/getHeader2")
    public String getHeader2(@RequestHeader("User-Agent") String userAgent) {
        return "userAgent : "+userAgent;
    }

    private static final String SESSION_KEY = "SESSION";


    /**
     * 存储session
     * @param request
     * @param response
     */
    @RequestMapping("/setSession")
    public void setSession(HttpServletRequest request,HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_KEY,"zhangsan");
    }

    /**
     * 获取Session
     * @param name
     * @return
     */
    @RequestMapping("/getSession")
    public Object getSession(@SessionAttribute(SESSION_KEY) String name) {
        return name;
    }
    @RequestMapping("/h1")
    public Object getH1() {
        return "<h1>我是h1的标签</h1>";
    }

    @RequestMapping("/Hi")//可以是一级路由也可以是n级路由
    public String Hi(String name,String password) {
        return "say Hi "+name+" 密码是： "+password;
    }

    @PostMapping("/sayHi")
    public String sayHi() {
        return "say Hi";
    }
    @RequestMapping("/Hi1")//可以是一级路由也可以是n级路由
    public String sayHi1(String name) {
        return "say Hi "+name;
    }
    @RequestMapping("/Hi2")//可以是一级路由也可以是n级路由
    public String sayHi2(Integer id) {
        if (id == null) return "参数错误";
        return "say Hi "+id;
    }
    @RequestMapping("/Hi3")//可以是一级路由也可以是n级路由
    public String sayHi3(int id) {
        return "say Hi "+id;
    }
    @RequestMapping("/Hi4")//可以是一级路由也可以是n级路由
    public String sayHi4(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.baidu.com/");//当然这里跳转了，就不会触发后续的return了。
        return "say Hi "+request.getParameter("name");
    }

}
