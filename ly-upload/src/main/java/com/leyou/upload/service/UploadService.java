package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Teddy
 */
@Service
@Slf4j
public class UploadService {

    private static final List<String> ALLOW_TYPES = Arrays.asList("image/jpeg","image/png");


    public String uploadImage(MultipartFile file){
        try{
            //校验文件
            String contentType = file.getContentType();
            if (!ALLOW_TYPES.contains(contentType)){
                throw  new LyException(ExceptionEnum.INVALID_FILE_TYPE);
            }
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (null == image){
                throw  new LyException(ExceptionEnum.INVALID_FILE_TYPE);
            }
            file.transferTo(new File("",file.getOriginalFilename()));
            return "";
        }catch (Exception e){
            //
            log.error("上传文件失败",e);
            throw new LyException(ExceptionEnum.UPLOAD_FILE_ERROR);
        }
    }
}
