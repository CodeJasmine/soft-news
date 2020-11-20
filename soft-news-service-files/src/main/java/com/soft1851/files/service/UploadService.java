package com.soft1851.files.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author wususu
 * @date 2020/11/20 6:51
 */
public interface UploadService {
    String uploadFdfs(MultipartFile file, String fileExtName) throws Exception;

    public String uploadOSS(MultipartFile file,String userId,String fileExtName) throws Exception;
}
