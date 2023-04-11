package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //他是个业务组件，所以用Service注解管理
//@Scope("prototype") //可以使容器中存在多个实例
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }
    @PostConstruct  //这个注解作用是在构造器后自动调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy //这个注解作用是在销毁前自动调用
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

    //sService依赖于dao的方式
    public String find(){
        return alphaDao.select();
    }

}
