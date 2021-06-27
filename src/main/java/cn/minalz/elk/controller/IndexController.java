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
    public Object index(String marking) {

        int a = 2/0;

        logger.debug("===elkdemo测试: 此时marking=" + marking);
        logger.info("===elkdemo: 此时marking=" + marking);
        logger.warn("===elkdemo: 此时marking=" + marking);
        logger.error("===elkdemo: 此时marking=" + marking);

        return "success";
    }
}

