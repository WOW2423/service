package com.enter.entercustomerservice.dao.database.mysql.mybatis;

import com.enter.entercustomerservice.entity.Test;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Liquid
 * @description
 * @date 2019/9/20
 */
@CacheNamespace
@org.apache.ibatis.annotations.Mapper
@Repository
public interface TestMapper extends Mapper<Test> {


}
