package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by Teddy
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    BRAND_NOT_FOUND(404,"品牌信息未查询到"),
    CATEGORY_NOT_FOUND(404,"分类信息未查询到"),
    BRAND_SAVE_ERROR(500,"新增品牌失败"),
    UPLOAD_FILE_ERROR(500,"上传文件失败"),
    INVALID_FILE_TYPE(500,"无效的文件类型"),
    ;
    private int code;
    private String  msg;


}
