package com.accenture.tcf.bars.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.tcf.bars.domain.FileProcessor;


@Controller
public class BarsController {
	private FileProcessor fileProcessor;
	private static final Logger logger = LoggerFactory.getLogger(BarsController.class);

	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/success")
	public String successInit(Model model) {
		return "success";
	}
	
	@PostMapping("/process.htm")
	public ModelAndView processRequest(HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, IOException, ParseException {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("success");

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> fields = upload.parseRequest(request);
			Iterator<FileItem> it = fields.iterator();
			
			while (it.hasNext()) {
				FileItem fileItem = it.next();
				
					String[] line = fileItem.getString().split("\n");
					for(int x=0;x<line.length;x++) {
						System.out.println(x + "\t" + line[x]);
						System.out.println(line[x].split(",")[0] + "\t" + 
								line[x].split(",")[1].replaceAll("/", "-") + "\t" + 
								line[x].split(",")[2].replaceAll("/", "-"));
						
					}
				
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		
		}
		
		
		return mav;
	}
}
