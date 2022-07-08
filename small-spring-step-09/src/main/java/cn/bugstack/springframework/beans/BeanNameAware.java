package cn.bugstack.springframework.beans;

import cn.bugstack.springframework.beans.factory.Aware;

public interface BeanNameAware extends Aware {
    void setBeanName(String name);
}
