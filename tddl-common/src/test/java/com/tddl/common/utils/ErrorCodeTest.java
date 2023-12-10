package com.tddl.common.utils;

import com.tddl.common.exception.code.ErrorCode;
import org.junit.Test;

public class ErrorCodeTest {

    @Test
    public void testOutput() {
        System.out.println(ErrorCode.ERR_CONFIG_MISS_GROUPKEY.getMessage("hello"));
    }
}
