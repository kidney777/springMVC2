/**
 * 
 */
package com.java.controller.app;

/**
* @author Kidney
* 创建时间：2019年1月23日 下午2:50:50
* Description:
*/
/**
 * @author KIDNEY
 *
 */

import java.io.File;
import java.lang.reflect.Field;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/upload/")
public class Test2Controller {

	@RequestMapping("singleFileUpload")
	public void singleFileUpload(@RequestParam(name = "bigHeadImage") MultipartFile file, HttpServletRequest request)
			throws Exception {
		// 1、getOriginalFilename():获取上传文件的文件名
		String originalFilename = file.getOriginalFilename();

		// 2、<input type="file" name="bigHeadImage"></p>
		// getName()：获取的是file控件中name的属性值，此处的属性值为bigHeadImage
		// String name = file.getName();
		// System.out.println("file.getOriginalFilename()=" + originalFilename);
		// System.out.println("file.getName()=" + name);

		// uuid
		String uuid = UUID.randomUUID().toString();
		// 3. 保存到指定目录下

		
		File filePath = new File("E:\\eclipse_workspace\\springMVC2\\WebContent\\upload\\" + uuid + originalFilename);
		//4.这里切换路径
		// String path = request.getServletContext().getRealPath("/upload");
		// File filePath = new File(path + "\\" + uuid + originalFilename);

		file.transferTo(filePath);
	}

	@RequestMapping("getUploadPath")
	public void getUploadPath(HttpServletRequest request) {
		// ServletContext sc = request.getServletContext();

		// String path = sc.getRealPath("/upload");
		String path = request.getSession().getServletContext().getRealPath("/upload");
		System.out.println(path);
	}

	@Test
	public void testUUID() {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}

}
