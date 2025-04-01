package com.dao;

import com.entity.ZiyuangoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuangoumaiVO;
import com.entity.view.ZiyuangoumaiView;


/**
 * 资源购买
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface ZiyuangoumaiDao extends BaseMapper<ZiyuangoumaiEntity> {
	
	List<ZiyuangoumaiVO> selectListVO(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
	
	ZiyuangoumaiVO selectVO(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
	
	List<ZiyuangoumaiView> selectListView(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);

	List<ZiyuangoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
	
	ZiyuangoumaiView selectView(@Param("ew") Wrapper<ZiyuangoumaiEntity> wrapper);
	
}
