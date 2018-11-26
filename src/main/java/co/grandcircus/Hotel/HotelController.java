package co.grandcircus.Hotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	
	@Autowired
	//private MenuItemDao menuItemDao;
	private HotelDao HotelDao;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
		
	@RequestMapping("/results")
	public ModelAndView showResults() {
		ModelAndView mv = new ModelAndView ("results");
		return mv;
	}	
		
		
		
	}
	

