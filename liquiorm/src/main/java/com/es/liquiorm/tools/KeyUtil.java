package com.es.liquiorm.tools;

import java.util.Random;

/**
 * @Author:chenjun
 * @Date:2019/3/20
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式: 系统时间 + 随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
