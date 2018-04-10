package com.fan.jeg;

import org.mybatis.generator.api.ShellRunner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		String config = App.class.getResource("/jeg-mysql.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
}
