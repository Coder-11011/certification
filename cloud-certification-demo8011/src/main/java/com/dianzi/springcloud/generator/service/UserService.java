package com.dianzi.springcloud.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dianzi.cloudcommon.utils.PageUtils;
import com.dianzi.springcloud.generator.entity.UserEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-01-29 14:14:20
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

