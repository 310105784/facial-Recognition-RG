package com.alex.lrface.common;

import java.util.HashMap;

/**
 * 通用返回工具类
 *
 * @author: Alex
 * @createTime: 2021/1/8
 * -------------------
 * @Gitee: https://gitee.com/alex_liu_zheng
 * @CSDN: https://blog.csdn.net/qq_41963148
 */
public class ResultUtil extends HashMap<String, Object> {
    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";
    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";
    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";
    private static final long serialVersionUID = 1L;

    /**
     * 初始化一个新创建的 ResultUtil 对象，使其表示一个空消息。
     */
    public ResultUtil() {
    }

    /**
     * 初始化一个新创建的 ResultUtil 对象
     *
     * @param type 状态类型
     * @param msg  返回内容
     */
    public ResultUtil(Type type, String msg) {
        super.put(CODE_TAG, type.value);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 ResultUtil 对象
     *
     * @param type 状态类型
     * @param msg  返回内容
     * @param data 数据对象
     */
    public ResultUtil(Type type, String msg, Object data) {
        super.put(CODE_TAG, type.value);
        super.put(MSG_TAG, msg);
        if (data != null) {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static ResultUtil success() {
        return ResultUtil.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static ResultUtil success(Object data) {
        return ResultUtil.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static ResultUtil success(String msg) {
        return ResultUtil.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static ResultUtil success(String msg, Object data) {
        return new ResultUtil(Type.SUCCESS, msg, data);
    }

    /**
     * 返回警告消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static ResultUtil warn(String msg) {
        return ResultUtil.warn(msg, null);
    }

    /**
     * 返回警告消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static ResultUtil warn(String msg, Object data) {
        return new ResultUtil(Type.WARN, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static ResultUtil error() {
        return ResultUtil.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static ResultUtil error(String msg) {
        return ResultUtil.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static ResultUtil error(String msg, Object data) {
        return new ResultUtil(Type.ERROR, msg, data);
    }

    /**
     * 状态类型
     */
    public enum Type {
        /**
         * 成功
         */
        SUCCESS(0),
        /**
         * 警告
         */
        WARN(301),
        /**
         * 错误
         */
        ERROR(500);
        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }
    }
}
