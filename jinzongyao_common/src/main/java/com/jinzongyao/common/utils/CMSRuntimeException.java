package com.jinzongyao.common.utils;
/**
 * 
 * @ClassName: CMSRuntimeException 
 * @Description: 自定义异常
 * @author:靳宗尧 
 * @date: 2019年7月15日 上午9:23:20
 */
public class CMSRuntimeException extends RuntimeException{
	private static final long serialversionUID = 1L;
	
	public CMSRuntimeException() {
		super();
	}
	
	public CMSRuntimeException(String message) {
		super(message);
	}
}
