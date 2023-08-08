package org.teach.study.spring.config;

import java.util.Objects;

import org.quincy.rock.core.vo.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * <b>Config。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex20
 * @since 1.0
 */
@Getter
@Setter
public class Config extends AbstractEntity {
	/**
	 * serialVersionUID。
	 */
	private static final long serialVersionUID = -6998553396723271391L;
	
	/**
	 * 配置id。
	 */
	private long id;
	/**
	 * 配置名。
	 */
	private String name;
	/**
	 * url。
	 */
	private String url;

	/**
	 * <b>构造方法。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 */
	public Config() {
		super();
	}
	
	/**
	 * <b>构造方法。</b>
	 * <p><b>详细说明：</b></p>
	 * <!-- 在此添加详细说明 -->
	 * 无。
	 * @param name 配置名称
	 * @param url url
	 */
	public Config(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
	/** 
	 * id。
	 * @see org.quincy.rock.core.vo.Vo#id()
	 */
	@Override
	public Long id() {
		return getId();
	}

	/** 
	 * id。
	 * @see org.quincy.rock.core.vo.Vo#id(java.lang.Object)
	 */
	@Override
	public Config id(Long id) {
		Objects.requireNonNull(id);
		setId(id);
		return this;
	}	
}
