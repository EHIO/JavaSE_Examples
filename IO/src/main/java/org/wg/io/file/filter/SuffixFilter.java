package org.wg.io.file.filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 可以过滤指定后缀的文件
 * @author Administrator
 *
 */
public class SuffixFilter implements FilenameFilter {

	private String suffix;

	public SuffixFilter(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {

		return name.endsWith(suffix);
	}

}
