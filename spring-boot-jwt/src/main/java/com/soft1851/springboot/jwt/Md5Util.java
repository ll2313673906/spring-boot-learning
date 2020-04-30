package com.soft1851.springboot.jwt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Md5Util {
    public static String getMD5(String plainText, int length) {
        try {
            //获取MD5实例
            MessageDigest md = MessageDigest.getInstance("MD5");
            //此处传入要加密的byte类型值
            md.update(plainText.getBytes());
            //此处得到的是md5加密后的byte类型值
            byte[] digest = md.digest();

            int i;
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                i = b;
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    sb.append(0);
                }
                //通过Integer.toHexString方法把值变为16进制
                sb.append(Integer.toHexString(i));
            }
            //从下标0开始，length目的是截取多少长度的值
            return sb.toString().substring(0, length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String tm = Md5Util.getMD5("shazi",16);
        System.out.println("当前秘钥为：" + tm);
    }
}
