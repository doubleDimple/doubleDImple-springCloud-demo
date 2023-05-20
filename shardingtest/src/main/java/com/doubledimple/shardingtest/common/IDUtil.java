package com.doubledimple.shardingtest.common;

public class IDUtil {

    /**
     * 随机id生成，使用雪花算法
     */
    public static long getRandomId() {
        SnowflakeIdWorker sf = new SnowflakeIdWorker();
        return sf.nextId();
    }
}
