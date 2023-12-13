package com.github.mySequence.common.utils;

import com.github.mySequence.common.exception.code.ErrorCode;
import org.junit.Test;

public class ErrorCodeTest {

    @Test
    public void testOutput() {
        System.out.println(ErrorCode.ERR_CONFIG_MISS_GROUPKEY.getMessage("hello"));
    }
}
