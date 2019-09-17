package com.woniu.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page {
    private Integer pageIndex;
    private Integer pageCount;
    private Integer dataCount;
}
