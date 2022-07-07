package test.bean;
import cn.bugstack.springframework.beans.BeanNameAware;
import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.BeanClassLoaderAware;
import cn.bugstack.springframework.beans.factory.BeanFactory;
import cn.bugstack.springframework.beans.factory.BeanFactoryAware;
import cn.bugstack.springframework.context.ApplicationContext;
import cn.bugstack.springframework.context.ApplicationContextAware;
import test.bean.UserDao;

public class UserService {

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    public UserService(String uId, String company, String location, UserDao userDao) {
        this.uId = uId;
        this.company = company;
        this.location = location;
        this.userDao = userDao;
    }

    public UserService() {
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String queryUserInfo() {
        return userDao.queryUsername(uId) + "," + company + "," + location;
    }
}