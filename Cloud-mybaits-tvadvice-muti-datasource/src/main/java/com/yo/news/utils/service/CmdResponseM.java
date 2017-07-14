package com.yo.news.utils.service;

import com.yo.news.utils.enums.EErrorCodes;
 

/**
 * 相应信息模型，包含错误信息和token值
 * 
 * 注解 于 2015/01/23 别人添加，不一定准确
 * 
 * @author 张庆健 JAN Email:mingrui-521@163.com
 * @CreatedTime：2014年10月22日 上午11:23:26
 * 
 */
public class CmdResponseM
{

	private int errorCode = EErrorCodes.NO_ERROR; // 如果成功为0，如果出现错误在为-1，如果登录出错则为
	private String errorMessage;
	 
	
	public int getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(int errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
