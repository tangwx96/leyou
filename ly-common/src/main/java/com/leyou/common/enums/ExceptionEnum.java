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
    ;
    private int code;
    private String  msg;


}
