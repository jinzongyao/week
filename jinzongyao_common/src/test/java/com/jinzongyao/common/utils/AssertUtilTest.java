package com.jinzongyao.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AssertUtilTest {

	/**
	 * 
	 * @Title: testIsTrue 
	 * @Description: 断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		String pwd ="123";
		String repwd="123";
		AssertUtil.isTrue(pwd.equals(repwd), "两次密码一致");
	}

	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: 断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		AssertUtil.isFalse(2<1, "这是假的");
	}

	/**
	 * 
	 * @Title: testIsNotNull 
	 * @Description: 断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNotNull() {
		AssertUtil.isNotNull(1, "不为空");
	}

	
	/**
	 * 
	 * @Title: testIsNull 
	 * @Description: 断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		AssertUtil.isNull(null, "为空");
	}

	/**
	 * 
	 * @Title: testIsNotEmpty 
	 * @Description:断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNotEmpty() {
		List list = new ArrayList();
		list.add(1);
		AssertUtil.isNotEmpty(list, "集合不为空，对象不能空");
	}

	/**
	 * 
	 * @Title: testNotEmpty 
	 * @Description:断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testNotEmpty() {
		Map map = new HashMap();
		map.put("12", 1);
		AssertUtil.notEmpty(map, "Map集合不为空，对象不能空");
	}

	/**
	 * 
	 * @Title: testHasText 
	 * @Description:断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testHasText() {
		AssertUtil.hasText(" ", "字符串必须有值");
	}

	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description:断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		AssertUtil.greaterThanZero(BigDecimal.valueOf(1), "值必须大于0");
	}

}
