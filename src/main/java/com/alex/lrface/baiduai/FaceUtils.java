package com.alex.lrface.baiduai;


import com.alex.lrface.baiduai.entity.BaiDuFace;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

/**
 * 百度人脸识别工具类
 *
 * @author: Alex
 * @createTime: 2021/1/8
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
public class FaceUtils {

    /**
     * 人脸注册
     * @param image 人脸图片
     * @param userId 用户id
     * @param userName 用户姓名
     * @return 操作信息
     */
    public static String addUser(String image, String groupId, String userId, String userName) {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("user_info", userName);
        options.put("quality_control", BaiDuFace.getQualityControl());
        options.put("liveness_control", BaiDuFace.getLivenessControl());
        options.put("action_type", "REPLACE");

        String imageType = "BASE64";

        // 人脸注册
        return errorMessage(FaceClientUtil.getClient().addUser(image, imageType, groupId, userId, options).toString());
    }

    /**
     * 查询人脸
     * @param image 人脸图片
     * @param userId 用户id
     * @param group 用户组
     * @return 操作信息
     */
    public static String search(String image, String userId, String group) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("max_face_num", "1");
        options.put("match_threshold", BaiDuFace.getMatchThreshold());
        options.put("quality_control", BaiDuFace.getQualityControl());
        options.put("liveness_control", BaiDuFace.getLivenessControl());
        options.put("user_id", userId);
        options.put("max_user_num", "1");

        String imageType = "BASE64";

        // 人脸搜索
        return errorMessage(FaceClientUtil.getClient().search(image, imageType, group, options).toString());
    }

    /**
     * 错误码转中文
     * @param json 百度ai返回的结果json
     * @return 错误信息
     */
    public static String errorMessage(String json) {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int res1 = jsonObject.getInteger("error_code");
        String errorCode = String.valueOf(res1);
        switch (errorCode) {
            case "222002":
            case "222003":
            case "222004":
            case "222005":
            case "222006":
            case "222007":
            case "222008":
            case "222009":
            case "222010":
            case "222011":
            case "222012":
            case "222013":
            case "222014":
            case "222015":
            case "222016":
            case "222017":
            case "222018":
            case "222019":
            case "222020":
            case "222021":
            case "222022":
            case "222023":
            case "222024":
            case "222025":
            case "222026":
                return "参数格式错误";
            case "222901":
            case "222902":
            case "222903":
            case "222904":
            case "222905":
            case "222906":
            case "222907":
            case "222908":
            case "222909":
            case "222910":
            case "222911":
            case "222912":
            case "222913":
            case "222914":
            case "222915":
            case "222916":
            case "222961":
                return "系统繁忙";
            case "1":
                return "服务器内部错误";
            case "2":
                return "服务暂不可用";
            case "3":
                return "调用的API不存在";
            case "4":
                return "集群超限额";
            case "6":
                return "无权限访问该用户数据";
            case "13":
                return "获取token失败";
            case "14":
                return "IAM 鉴权失败";
            case "15":
                return "应用不存在或者创建失败";
            case "17":
                return "每天请求量超限额";
            case "18":
                return "QPS超限额";
            case "19":
                return "请求总量超限额";
            case "100":
                return "无效的access_token参数";
            case "110":
                return "access_token无效    ";
            case "111":
                return "access token过期";
            case "222001":
                return "必要参数未传入";
            case "222201":
                return "服务端请求失败";
            case "222202":
                return "图片中没有人脸";
            case "222203":
                return "无法解析人脸";
            case "222204":
                return "从图片的url下载图片失败";
            case "222205":
                return "服务端请求失败";
            case "222206":
                return "服务端请求失败";
            case "222207":
                return "未找到匹配的用户";
            case "222208":
                return "图片的数量错误";
            case "222209":
                return "face token不存在";
            case "222300":
                return "人脸图片添加失败";
            case "222301":
                return "获取人脸图片失败";
            case "222302":
                return "服务端请求失败";
            case "222303":
                return "获取人脸图片失败";
            case "223100":
                return "操作的用户组不存在";
            case "223101":
                return "该用户组已存在";
            case "223103":
                return "找不到该用户";
            case "223104":
                return "group_list包含组数量过多";
            case "223105":
                return "该人脸已存在";
            case "223106":
                return "该人脸不存在";
            case "223110":
                return "uid_list包含数量过多";
            case "223111":
                return "目标用户组不存在";
            case "223112":
                return "quality_conf格式不正确";
            case "223113":
                return "人脸有被遮挡";
            case "223114":
                return "人脸模糊";
            case "223115":
                return "人脸光照不好";
            case "223116":
                return "人脸不完整";
            case "223117":
                return "app_list包含app数量过多";
            case "223118":
                return "质量控制项错误";
            case "223119":
                return "活体控制项错误";
            case "223120":
                return "活体检测未通过";
            case "223122":
                return "质量检测未通过 右眼遮挡程度过高";
            case "223123":
                return "质量检测未通过 左脸遮挡程度过高";
            case "223124":
                return "质量检测未通过 右脸遮挡程度过高";
            case "223125":
                return "质量检测未通过 下巴遮挡程度过高";
            case "223126":
                return "质量检测未通过 鼻子遮挡程度过高";
            case "223127":
                return "质量检测未通过 嘴巴遮挡程度过高";
            case "222350":
                return "公安网图片不存在或质量过低";
            case "222351":
                return "身份证号与姓名不匹配或该身份证号不存在";
            case "222352":
                return "身份证名字格式错误";
            case "222353":
                return "身份证号码格式错误";
            case "222354":
                return "公安库里不存在此身份证号";
            case "222355":
                return "身份证号码正确，公安库里没有对应的照片";
            case "222360":
                return "身份证号码或名字非法（公安网校验不通过）";
            default:
                return "200";
        }
    }

}
