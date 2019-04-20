package org.wg.io.file.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 */
public class FilterByHidden implements FileFilter {

    @Override
    public boolean accept(File pathName) {

        return !pathName.isHidden();
    }

}
