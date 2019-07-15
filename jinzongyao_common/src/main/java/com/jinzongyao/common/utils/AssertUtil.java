package com.jinzongyao.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: 断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description: 断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description: 断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description: 断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description:断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description:断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description:断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。
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
	 * @Description:断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。
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
