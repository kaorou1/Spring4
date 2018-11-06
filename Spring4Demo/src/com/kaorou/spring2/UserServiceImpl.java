package com.kaorou.spring2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Scope("prototype")
@Service("userService")
public class UserServiceImpl implements UserService {

    //@Autowired
    //@Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserServiceImpl方法执行了....");
        userDao.save();
    }
}
