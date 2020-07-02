package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Controller
@RequestMapping("/phone") // 공통으로 주소 묶기<타입 & 메소드 묶기> RequestMapping("/phone")
public class PhoneController {
	
	// @RequestMapping(value = "/phone/list", method= {RequestMethod.POST,
	// RequestMethod.GET}) -- 생략
	/*
	 * @RequestMapping("/list") public String list() {
	 * System.out.println("/phone/list"); return "WEB-INF/view/index.jsp"; }
	 */
	
	
	// writeForm 
	@RequestMapping(value = "/writeForm",method = {RequestMethod.GET, RequestMethod.POST})
	public String writeForm() {

		return "/WEB-INF/view/writeForm.jsp";
	}
	
	
	// write
	@RequestMapping(value = "/write",method = {RequestMethod.GET, RequestMethod.POST})
	public String write (@ModelAttribute PersonVo personVo) {
		
	System.out.println("/phone.write()");
	System.out.println(personVo.toString());
	
	PhoneDao phoneDao = new PhoneDao();
	
	phoneDao.personInsert(personVo);

	return "redirect:/phone/list";
	}
	
	/*
	// write 하나의 데이터값이 없을때 (없으면 HTTP 400 - Bad Request)
		@RequestMapping(value = "/write",method = RequestMethod.GET)
		public String write (@RequestParam("name")String name,
							 @RequestParam("hp")String hp,
							 @RequestParam(value="company", required = false, defaultValue = "000")String company){
		
			
		System.out.println("/phone.write()");
		System.out.println(name + "," + hp + "," + company);
		
		return "/WEB-INF/view/list.jsp";
		}
	*/
	// list
	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public String list(Model model) {

		PhoneDao phoneDao = new PhoneDao();
		List<PersonVo> pList = phoneDao.getPersonList();
		System.out.println(pList.toString());

		model.addAttribute("pList", pList);
		return "/WEB-INF/view/list.jsp";
	}
	
	// update
	@RequestMapping(value = "/updateForm", method = {RequestMethod.GET})
	public String updateForm() {
		
	}


}
