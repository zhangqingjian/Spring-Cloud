/**
 * 
 */
package com.yo.news.service.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;
import com.yo.news.clip.business.ebo.ClipEbo;
import com.yo.news.clip.dao.ClipDao;
import com.yo.news.clip.vo.ClipModel;
import com.yo.news.main.BlogProperties;

/**
 */
/**
 * @author JAN
 * @CreatedTime：2017年7月6日 下午5:44:44 说明：
 */

@RestController
public class Service3Controller
{
	@Autowired
	private ClipEbo clipEbo;
	@Autowired
	BlogProperties blogProperties;
	private static final Log log = LogFactory.getLog(Service3Controller.class);

	@RequestMapping("/service3")
	public Object service3(HttpSession session) throws Exception
	{
		ClipModel clipModel = clipEbo.getClipDetail("1", "6204550858912957443");
		log.info("service3");
		log.info(blogProperties.getName());
		return clipModel;
	}
}
