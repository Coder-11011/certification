package com.dianzi.springcloud.generator.service.impl;

import com.dianzi.cloudcommon.utils.PageUtils;
import com.dianzi.cloudcommon.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.dianzi.springcloud.generator.dao.UserDao;
import com.dianzi.springcloud.generator.entity.UserEntity;
import com.dianzi.springcloud.generator.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(new Query<UserEntity>().getPage(params), new QueryWrapper<UserEntity>());

        return new PageUtils(page);
    }

}