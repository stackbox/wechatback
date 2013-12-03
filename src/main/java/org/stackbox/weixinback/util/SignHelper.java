package org.stackbox.weixinback.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SignHelper {
	
	private static String token = "weixin";
	
	public static boolean checkSignature(String signature,String timestamp,String nonce )
	{
		String[] temp = new String[3];
		temp[0] = token;
		temp[1] = timestamp;
		temp[2] = nonce;
		Arrays.sort(temp);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<temp.length;i++)
			sb.append(temp[i]);
		String _signature = convertSHA1(sb.toString());
		if(signature.equals(_signature))
			return true;
		else {
			return false;
		}		
	}
	
	private static String convertSHA1(String plainText)
	{
		String result = "";
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++)
			{
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
		} catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return result;
	}
}
