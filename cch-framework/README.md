# 开发指引 #

## 环境搭建 ##

### 初始化Postgres ###

- 本地安装docker
- 本地安装docker-compose
- 执行启动命令
```
cd cch-docker && docker-compose up -d
```

### 导入数据库表

gradle 执行 task migratePostgres

## MyBatis Generator ##

新增表使用MyBatis Generator创建model, mapper, mapper.xml

在MyBatisGenerator/generatorConfig.xml中添加新增的表的映射关系

gradle 执行 task mybatisGenerator