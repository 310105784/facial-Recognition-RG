package com.alex.lrface.baiduai.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 百度人脸识别配置类
 *
 * @author: Alex
 * @createTime: 2021/1/8
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
@Component
@ConfigurationProperties(prefix = "baidu.face")
public class BaiDuFace {

    /**
     * 项目id
     */
    private static String appId;

    /**
     * 项目apikey
     */
    private static String apiKey;

    /**
     * 项目secretKey
     */
    private static String secretKey;

    /**
     * 人脸搜索匹配阈值
     */
    private static String matchThreshold;

    /**
     * 图片质量控制
     */
    private static String qualityControl;

    /**
     * 活体检测控制
     */
    private static String livenessControl;


    public static String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public static String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public static String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public static String getMatchThreshold() {
        return matchThreshold;
    }

    public void setMatchThreshold(String matchThreshold) {
        this.matchThreshold = matchThreshold;
    }

    public static String getQualityControl() {
        return qualityControl;
    }

    public void setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
    }

    public static String getLivenessControl() {
        return livenessControl;
    }

    public void setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
    }

}
