package com.entity.view;

import com.entity.JiaowutongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 教务通知
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaowutongzhi")
public class JiaowutongzhiView extends JiaowutongzhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String jiaowutongzhiValue;



	public JiaowutongzhiView() {

	}

	public JiaowutongzhiView(JiaowutongzhiEntity jiaowutongzhiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaowutongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getJiaowutongzhiValue() {
				return jiaowutongzhiValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setJiaowutongzhiValue(String jiaowutongzhiValue) {
				this.jiaowutongzhiValue = jiaowutongzhiValue;
			}











}
