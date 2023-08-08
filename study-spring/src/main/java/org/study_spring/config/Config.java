package org.study_spring.config;

import org.quincy.rock.core.vo.AbstractEntity;
import org.quincy.rock.core.vo.Vo;

import lombok.Getter;
import lombok.Setter;

/**
 * <b>Config。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */

@SuppressWarnings("serial")
//@Data
@Getter
@Setter
public class Config extends AbstractEntity {


private long id;

/**
 * name。
 */
private String name;
/**
 * url。
 */
private String url;
	/** 
	 * id。
	 * @see org.quincy.rock.core.vo.Vo#id()
	 */
	@Override
	public Long id() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Vo<Long> id(Long id) {
		// TODO Auto-generated method stub
		this.id=id;
		return this;
	}

}
