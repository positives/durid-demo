package com.zr.druiddemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author zr
 * @ClassName: Test
 * @Description: TODO
 * @date 2019/4/28 17:25
 */
@Mapper
public interface TestMapper {


    @Select("select * from tb_aaa")
    List<Map<String,Object>> queryAll();
}
