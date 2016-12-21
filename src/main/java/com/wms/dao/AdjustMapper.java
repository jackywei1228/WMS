package com.wms.dao;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.springframework.stereotype.Repository;
import com.wms.bean.Adjust;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface AdjustMapper {
    int deleteByPrimaryKey(Integer jId);

    int insert(Adjust record);

    int insertSelective(Adjust record);

    List<Adjust> selectByPrimaryKey(Integer jId);

    List<Adjust> select(Pagination page,Map<String,Object> map);

    int updateByPrimaryKeySelective(Adjust record);

    int updateByPrimaryKey(Adjust record);
}