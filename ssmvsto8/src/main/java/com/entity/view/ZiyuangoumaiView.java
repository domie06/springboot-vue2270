package com.entity.view;

import com.entity.ZiyuangoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资源购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
@TableName("ziyuangoumai")
public class ZiyuangoumaiView  extends ZiyuangoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiyuangoumaiView(){
	}
 
 	public ZiyuangoumaiView(ZiyuangoumaiEntity ziyuangoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, ziyuangoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
