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
	 * @Description: ����Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		String pwd ="123";
		String repwd="123";
		AssertUtil.isTrue(pwd.equals(repwd), "��������һ��");
	}

	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: ����Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		AssertUtil.isFalse(2<1, "���Ǽٵ�");
	}

	/**
	 * 
	 * @Title: testIsNotNull 
	 * @Description: ���Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNotNull() {
		AssertUtil.isNotNull(1, "��Ϊ��");
	}

	
	/**
	 * 
	 * @Title: testIsNull 
	 * @Description: ���Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		AssertUtil.isNull(null, "Ϊ��");
	}

	/**
	 * 
	 * @Title: testIsNotEmpty 
	 * @Description:���Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testIsNotEmpty() {
		List list = new ArrayList();
		list.add(1);
		AssertUtil.isNotEmpty(list, "���ϲ�Ϊ�գ������ܿ�");
	}

	/**
	 * 
	 * @Title: testNotEmpty 
	 * @Description:����Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testNotEmpty() {
		Map map = new HashMap();
		map.put("12", 1);
		AssertUtil.notEmpty(map, "Map���ϲ�Ϊ�գ������ܿ�");
	}

	/**
	 * 
	 * @Title: testHasText 
	 * @Description:�����ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testHasText() {
		AssertUtil.hasText(" ", "�ַ���������ֵ");
	}

	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description:����ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ��
	 * @param exp
	 * @param message
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		AssertUtil.greaterThanZero(BigDecimal.valueOf(1), "ֵ�������0");
	}

}
