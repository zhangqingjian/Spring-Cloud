package com.yo.base.utils.base;


/**
 * @author 张庆健 JAN Email:mingrui-521@163.com
 * @CreatedTime：2014年10月22日 上午11:19:25
 */
public class MyString
{
	// 字母吧
    private static final char[] ALPHABET =
    { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    // 字母数字
    private static final char[] ALPHABET_AND_NUM =
    { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', '0' };
	public static boolean IsNullOrEmpty(Object s)
	{
		if (s == null || "".equals(s.toString()))
		{
			return true;
		}
		return false;
	}

	 

	public static boolean IsNullOrTrimEmpty(Object s)
	{
		if (s == null || "".equals(s.toString().trim()))
		{
			return true;
		}
		return false;
	}

	/**
	 * @author JAN
	 * @CreatedTime：2015年9月8日 下午6:50:01 说明：
	 * @param sourceStr
	 *            将要被Trim的数据源
	 * @param trimChar
	 *            TrimEnd掉那个字符
	 * @return
	 */
	public static String trimEnd(String sourceStr, String trimChar)
	{
		int iLastSign = sourceStr.lastIndexOf(trimChar);
		if (MyString.IsNullOrEmpty(sourceStr) == false && iLastSign == sourceStr.length() - 1)
		{
			sourceStr = sourceStr.substring(0, iLastSign);
		}
		return sourceStr;
	}

	// 根据Unicode编码完美的判断中文汉字和符号
	public static boolean isChinese(char c)
	{
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * 检验是否是正数
	 * 如果是正数或零，返回true；如果是负数，返回false
	 * @param num
	 * @return
	 */
	public static boolean isPositiveNum(Integer num)
	{
		if (num==null||num<0) {
			return false;
		}
		return true;
	}
	
	/**
	 * 检验是否是正数
	 * 如果是正数或零，返回true；如果是负数，返回false
	 * @param num
	 * @return
	 */
	public static boolean isPositiveNum(Long num)
	{
		if (num==null||num<0) {
			return false;
		}
		return true;
	}
	 
	
}
