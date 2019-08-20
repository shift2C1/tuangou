package com.eg.test.conmmon.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErorInfoException extends Exception {
    private String code;
    private String msg;
}
