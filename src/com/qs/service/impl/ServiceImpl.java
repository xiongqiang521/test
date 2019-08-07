package com.qs.service.impl;

import com.qs.bean.Users;
import com.qs.dao.Dao;
import com.qs.dao.impl.DaoImpl;
import com.qs.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component(value = "service")
public class ServiceImpl implements Service {
    @Resource(name = "dao")
    DaoImpl dao;

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

    public List<Users> getAll(){
        System.out.println(dao);
        return dao.getAll();
    }


}
