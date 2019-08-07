package com.qs.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qs.bean.Users;
import com.qs.dao.impl.DaoImpl;
import com.qs.service.Service;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


public class Show extends ActionSupport {

    @Resource(name = "service")
    Service service;

    public void setService(Service service) {
        this.service = service;
    }


    public String showAll(){
        System.out.println(service);
        List<Users> usersList = service.getAll();
        ActionContext context = ActionContext.getContext();
        //放入值栈，用 # 取值
        Map<String, Object> session = context.getSession();
        session.put("msg","list");
        session.put("userList",usersList);
        System.out.println(usersList);

//        System.out.println(context.getValueStack());

        return "success";
    }

}
