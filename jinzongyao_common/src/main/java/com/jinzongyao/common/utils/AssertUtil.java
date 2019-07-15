package com.jinzongyao.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: ����Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean exp, String message){
		if(!exp) {
			throw new CMSRuntimeException(message);
		}				
	}
	
	/**
	 * 
	 * @Title: isFalse 
	 * @Description: ����Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean exp, String message){
		if(exp) {
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * 
	 * @Title: isNotNull 
	 * @Description: ���Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isNotNull(Object obj, String message){
		if(obj==null){
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * 
	 * @Title: isNull 
	 * @Description: ���Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj, String message){
		if(obj!=null){
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * 
	 * @Title: isNotEmpty 
	 * @Description:���Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isNotEmpty(Collection c, String message){
		if(c==null || c.size()==0){
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * 
	 * @Title: notEmpty 
	 * @Description:����Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void notEmpty(Map<?,?> map, String message){
		if(map==null || map.isEmpty()){
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * 
	 * @Title: hasText 
	 * @Description:�����ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void hasText(String src, String message){
		if(null!=src && src.trim().length()>0){
			throw new CMSRuntimeException(message);
		}
	}

	/**
	 * 
	 * @Title: greaterThanZero 
	 * @Description:����ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void greaterThanZero(BigDecimal value, String message){
		if(value.equals(0)){
			throw new CMSRuntimeException(message);
		}
	}


}
