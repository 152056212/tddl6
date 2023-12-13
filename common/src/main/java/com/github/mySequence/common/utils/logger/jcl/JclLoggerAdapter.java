package com.github.mySequence.common.utils.logger.jcl;

import java.io.File;

import com.github.mySequence.common.utils.logger.Level;
import com.github.mySequence.common.utils.logger.Logger;
import com.github.mySequence.common.utils.logger.LoggerAdapter;
import org.apache.commons.logging.LogFactory;


public class JclLoggerAdapter implements LoggerAdapter {

    public Logger getLogger(String key) {
        return new JclLogger(LogFactory.getLog(key));
    }

    public Logger getLogger(Class<?> key) {
        return new JclLogger(LogFactory.getLog(key));
    }

    private Level level;

    private File  file;

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
