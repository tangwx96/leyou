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
    PRICE_CANNOT_BE_NULL(400,"AASDSA"),
    CATEGORY_NOT_FOUND(404,"分类信息未查询到"),
    ;
    private int code;
    private String  msg;


}
