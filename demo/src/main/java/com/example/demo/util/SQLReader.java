package com.example.demo.util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLReader {
	
	private Logger log = LoggerFactory.getLogger(SQLReader.class);
	
	private XMLConfiguration config;

	private SQLReader(String fileName) {

		// 默認的分隔符號為","，因此必須改為SQL不會用到的符號
		XMLConfiguration.setDefaultListDelimiter('※');
		try {
			config = new XMLConfiguration(fileName);
			config.setValidating(false);
			config.setReloadingStrategy(new FileChangedReloadingStrategy());
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	public static SQLReader getInstance(Class<?> clazz) {
		String clazzName = clazz.getName();
		String xmlPath = clazzName.replaceAll("\\.", "/") + ".xml";
		return getInstance(xmlPath);
	}

    public static SQLReader getInstance(String fileName) {
        SQLReader mySelf = new SQLReader(fileName);
        return mySelf;
    }

    /**
     * 取得 <tt>tag<tt> 所在的SQL字串
     * @param tag
     * @return
     */
    public String getString(String tag) {
    	String sql = config.getString(tag);
    	log.info(sql);
        return sql;
    }
}
