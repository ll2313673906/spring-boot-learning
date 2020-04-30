package com.soft1851.springboot.jwt;

import com.auth0.jwt.interfaces.DecodedJWT;

public class Test {
    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(true, "soft1851", "软件1851");

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());
        long currentTime=System.currentTimeMillis();
        long time = jwt.getExpiresAt().getTime();
        while (currentTime<= time){
            currentTime=System.currentTimeMillis();
        }
        System.out.println("token已失效");
    }

}


