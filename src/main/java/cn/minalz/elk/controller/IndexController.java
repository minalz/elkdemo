package cn.minalz.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/index")
    public Object index() {
        for (int i = 0; i < 10; i++) {
            logger.debug("===elkdemo测试: 此时i=" + i);
            logger.info("===elkdemo: 此时i=" + i);
            logger.warn("===elkdemo: 此时i=" + i);
            logger.error("===elkdemo: 此时i=" + i);
        }

        return "success";
    }
}

