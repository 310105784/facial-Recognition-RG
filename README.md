# 人脸注册登录

### 前言
lrFace的意思是RegisterLoginFace，写这个项目主要是为了把自己所学的知识分享出来，希望这个项目能帮到大家，大家一起共同学习，共同进步。

### 项目介绍
项目主要使用的是Spring+SpirngMvc+SpringBoot敏捷开发系统架构，使用百度智能云提供人脸识别接口

#### 技术选型
- SpringBoot 2.4.1
- Spring
- SpringMvc
- Mysql 5.7
- BaiduAip 4.15.1
- Fastjson 1.2.70

### 目录结构

```
    |————baiduai 百度人脸识别
    |————————entity 百度人脸识别参数配置
    |————common 公共
    |————controller 前端接口
    |————entity 实体类
    |————mapper 数据访问
    |————service 业务
```


### 预览图
![首页](https://images.gitee.com/uploads/images/2021/0111/163412_f5348b60_7467053.png "首页")
![登录](https://images.gitee.com/uploads/images/2021/0111/163514_ae25519b_7467053.png "登录")
![注册](https://images.gitee.com/uploads/images/2021/0111/163553_ba6b8d8e_7467053.png "注册")

### 安装教程
1. 在百度智能云中开通人脸识别，创建应用，得到appId、apiKey、secretKey

![创建应用](https://images.gitee.com/uploads/images/2021/0111/164739_8250c628_7467053.png "创建应用")

2. 修改application.yml中的“百度人脸识别配置”

![修改配置](https://images.gitee.com/uploads/images/2021/0111/164925_e5f6eb3f_7467053.png "修改配置")

3. 最后导入SQL文件修改application.yml中的“数据源配置”

### 常见问题
1. 百度人脸识别中的可视化人脸库的组可动态创建，具体请看百度人脸识别官方文档
2. 前端获取人脸，如果报错无法打开摄像头，请把项目改为https协议

### 参与贡献
​感谢百度智能云 [百度智能云官网](https://cloud.baidu.com/)

