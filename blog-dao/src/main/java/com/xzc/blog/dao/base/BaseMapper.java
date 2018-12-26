package com.xzc.blog.dao.base;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Classname BaseMapper
 * @Description TODO
 * @Date 2018/12/26 15:01
 * @Created by xzcawl
 */
@Repository
public interface BaseMapper<T> {
    /**
     * 插入一条数据
     * @param t
     * @return 本次生成的ID
     */
    Integer insertOne(T t);

    /**
     *
     * @param param
     * @return
     */
    Long countByMultiParam(Map<String, Object> param);

    List<T> queryPaged(Map<String, Object> param);

    /**
     * 根据多条件查找
     * @param param
     * @return
     */
    T queryByMulti(Map<String, Object> param);

    /**
     *
     * @param param
     * @return
     */
    Integer updateByMultiParam(Map<String, Object> param);

    /**
     * 根据多条件DISTINCT 某个字段
     * @param param
     * @return
     */
    List<String> selectDistinctFiled(Map<String, Object> param);

    Integer batchInsert(@Param("insertList") List<T> insertList);

}

