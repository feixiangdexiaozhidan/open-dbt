package com.highgo.opendbt.common.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: md5工具类
 * @Title: MD5Util
 * @Package com.highgo.opendbt.common.utils
 * @Author: highgo
 * @Copyright 版权归HIGHGO企业所有
 * @CreateTime: 2023/8/8 9:41
 */
public class MD5Util {
 static Logger logger = LoggerFactory.getLogger(MD5Util.class);
  /**
   * 获取上传文件的md5
   * @param file
   * @return
   * @throws
   */
  public static String getMd5(MultipartFile file) {
    try {
      byte[] uploadBytes = file.getBytes();
      //file->byte[],生成md5
      String md5Hex = DigestUtils.md5Hex(uploadBytes);
      //file->InputStream,生成md5
     // String md5Hex1 = DigestUtils.md5Hex(file.getInputStream());
      //对字符串生成md5
     // String s = DigestUtils.md5Hex("字符串");
      return md5Hex ;
    } catch (Exception e) {
      logger.error(e.getMessage());
    }
    return null;
  }
}
