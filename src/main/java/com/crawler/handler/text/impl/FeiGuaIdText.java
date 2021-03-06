package com.crawler.handler.text.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crawler.entity.Storage;
import com.crawler.entity.TextUnit;
import com.crawler.handler.text.IText;
import com.crawler.util.HttpUtil;
import com.crawler.util.StringUtils;

public class FeiGuaIdText implements IText {

	@Override
	public String getText(String text,WebElement web,WebDriver webDriver,TextUnit textUnit,Storage storage) {
		if(StringUtils.isEmpty(textUnit.getXpath())){
			text = webDriver.getCurrentUrl();
		}
		String id = HttpUtil.getQueryString(text, "id");
		return id ;
		
	}
}
