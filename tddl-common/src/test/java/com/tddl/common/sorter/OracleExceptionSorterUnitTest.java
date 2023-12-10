package com.tddl.common.sorter;

import com.tddl.common.jdbc.sorter.OracleExceptionSorter;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

/**
 * @author yangzhu
 */
public class OracleExceptionSorterUnitTest {

    @Test
    public void all() {
        OracleExceptionSorter s = new OracleExceptionSorter();
        int[] errors = new int[] { 28, 600, 1012 };

        SQLException e = new SQLException("reason", "08S01");

        // Assert.assertTrue(s.isExceptionFatal(e));

        for (int err : errors) {
            e = new SQLException("reason", "01XXX", err);
            Assert.assertTrue(s.isExceptionFatal(e));
        }

        e = new SQLException("NO DATASOURCE!", "01XXX", 21001);
        Assert.assertTrue(s.isExceptionFatal(e));
        e = new SQLException("NO ALIVE DATASOURCE", "01XXX", 21001);
        Assert.assertTrue(s.isExceptionFatal(e));

        e = new SQLException("ORA-XXX-TNS-XXX", "01XXX", 21001);
        Assert.assertTrue(s.isExceptionFatal(e));

        e = new SQLException("msg", "01XXX", -1);
        Assert.assertFalse(s.isExceptionFatal(e));

        e = new SQLException("msg", "01XXX", -1);

        e.initCause(new SQLException("msg", "01XXX", -1));
        Assert.assertFalse(s.isExceptionFatal(e));

        e = new SQLException("msg", "01XXX", -1);
        e.initCause(null);
        Assert.assertFalse(s.isExceptionFatal(e));
    }
}
