package com.weishuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by WS on 2018/10/22.
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {
    public void upLoadFile(@RequestParam(value = "upFile", required = false)
                                     MultipartFile upFile, HttpServletRequest request, Model model) throws IOException {
        {
            String fileName = upFile.getOriginalFilename();
            File targetFile = new File("D:/FILE_TMP",fileName);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            //开始保存文件
            upFile.transferTo(targetFile);
        }
    }
}
