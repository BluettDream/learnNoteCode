package org.learn.demon.utils;

import java.util.UUID;

/**
 * @author blue
 * @date 2021/7/22
 */
public class IdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
