package com.alex.lrface.baiduai;


import com.alex.lrface.baiduai.entity.BaiDuFace;
import com.baidu.aip.face.AipFace;

/**
 * 百度人脸识别连接类
 *
 * @author: Alex
 * @createTime: 2021/1/8
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
public class FaceClientUtil {

    private static AipFace aipFace;

    public static AipFace getClient() {
        aipFace = new AipFace(BaiDuFace.getAppId(), BaiDuFace.getApiKey(), BaiDuFace.getSecretKey());
        return aipFace;
    }
}
