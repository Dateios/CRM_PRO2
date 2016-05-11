package service;

import entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import dao.userDao;
/**
 * Created by ’≈∫Ω on 2016/5/10.
 */
@Service("userService")
public class UserServiceImp implements userService {
    @Resource
    private userDao userDao;
    public User login(User user){
        return userDao.login(user);
    }
}
