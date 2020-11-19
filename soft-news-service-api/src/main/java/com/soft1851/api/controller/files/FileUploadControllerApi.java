package com.soft1851.api.controller.files;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wususu
 * @date 2020/11/20 7:00
 */
@Api(value = "文件上传controller",tags = {"文件上传controller"})
@RequestMapping("fs")
public interface FileUploadControllerApi {
//    @ApiOperation(value = "上传用户头像",notes = "上传用户头像",httpMethod = "POST")
//    @PostMapping("uploadFace")
//    GraceResult uploadFace(@RequestParam String userId, MultipartFile file) throws Exception;


//    @PostMapping("/uploadSomeFiles")
//    GraceResult uploadSomeFiles(@RequestParam String userId,MultipartFile[] files) throws  Exception;
}

