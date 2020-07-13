package com.cch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cch.mapper")
public class MyBatisMapperScanConfig {}
