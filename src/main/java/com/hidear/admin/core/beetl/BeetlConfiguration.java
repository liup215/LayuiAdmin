package com.hidear.admin.core.beetl;

import com.hidear.admin.core.util.ToolUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

	@Override
	public void initOther() {

		groupTemplate.registerFunctionPackage("tool", new ToolUtil());

	}

}
