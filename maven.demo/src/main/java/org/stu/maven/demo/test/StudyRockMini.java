package org.stu.maven.demo.test;

import org.quincy.rock.core.util.CoreUtil;
import org.quincy.rock.core.util.StringUtil;

/**
 * <b>StudyRockMini。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author mex20
 * @since 1.0
 */
public final class StudyRockMini {
	private StudyRockMini() {
		
	}
	
	public static void studyStringUtil() {
		String str=StringUtil.getUniqueIdentifierName("var");
		System.out.println(str);
		str="d:\\"+str+".txt";
		System.out.println(str);
		
		str=StringUtil.str2hex("1234567");
		System.out.println(str);
		str=StringUtil.hex2Str(str);
		System.out.println(str);
		
		str=StringUtil.toCamelString("dept_name", '_');
		System.out.println(str);
		str=StringUtil.objName2DbName("deptName", "f_", '_');
		System.out.println(str);
		str=StringUtil.dbName2ObjName(str, "f_", '_');
		System.out.println(str);
	}
	
	public static void studyCoreUtil() {
		String str=CoreUtil.toHexString(123456700);
		System.out.println("16:"+str);
		str=CoreUtil.hexToBinary(str);
		System.out.println("2:"+str);
		str=CoreUtil.binaryToHex(str);
		System.out.println("16:"+str);
		System.out.println("10:"+Integer.parseInt(str, 16));	
	}
}
