package com.commons.studyone;
import org.junit.Test;

/**
 * 整数转成16进制
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author w
 * @createdate 2019年8月2日
 */

public class IntToHex {
	private final int targ = 16; //需要转换的进制。

	/**
	 *  整数转成16进制
	 * @param num
	 * @return
	 */
	public String int2Hex(int num) {

		StringBuilder sb = new StringBuilder();

		int temp = num / targ;
		int mark = num % targ;

		sb.append(num2Char(mark));

		while (temp > 0) {
			num = temp;
			mark = num % targ;
			sb.append(num2Char(mark));
			temp = num / targ;

		}

		return sb.reverse().toString();
	}

	/** 数字变成对应的字符串
	* 10进制以上的数在计算机中以 A,B,C,D等表示。这个方法只对应了16进制以下。
	* @param n
	* @return
	*/

	public String num2Char(int n) {
		if (n < 10) {
			return String.valueOf(n);
		}

		String ch = "";
		switch (n) {
			case 10:
				ch = "A";
				break;
			case 11:
				ch = "B";
				break;
			case 12:
				ch = "C";
				break;
			case 13:
				ch = "D";
				break;
			case 14:
				ch = "E";
				break;
			case 15:
				ch = "F";
				break;
		}
		return ch;

	}

	@Test
	public void test() {
		System.out.println("=====" + int2Hex(64));

	}

}
