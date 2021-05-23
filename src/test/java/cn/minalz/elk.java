package cn.minalz;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: minalz
 * @date: 2021-05-22 20:35
 **/
@Slf4j
public class elk {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            log.info("测试elk,此时i=" + i);
        }
    }
}
