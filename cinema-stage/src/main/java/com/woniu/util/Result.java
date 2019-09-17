package com.woniu.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String code;
    private String message;
    private Object object;
    private List list;

}
