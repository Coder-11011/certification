package com.dianzi.springcloud.generator.dao;

import com.dianzi.springcloud.generator.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-01-29 14:14:20
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
