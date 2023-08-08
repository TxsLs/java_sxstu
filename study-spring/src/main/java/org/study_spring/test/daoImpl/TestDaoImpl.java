package org.study_spring.test.daoImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.study_spring.test.dao.TestDao;

/**
 * <b>TestDaoImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */
@Repository
//@Component

public class TestDaoImpl implements TestDao {

	/** 
	 * sayTest。
	 * @see org.study_spring.test.dao.TestDao#sayTest()
	 */
	

	
	
	@Override
	public void sayTest() {
		// TODO Auto-generated method stub
		System.out.println("test!!!!!!!");
	}

}
