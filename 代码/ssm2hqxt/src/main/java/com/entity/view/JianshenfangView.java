package com.entity.view;

import com.entity.JianshenfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身房
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 23:49:26
 */
@TableName("jianshenfang")
public class JianshenfangView  extends JianshenfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenfangView(){
	}
 
 	public JianshenfangView(JianshenfangEntity jianshenfangEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
