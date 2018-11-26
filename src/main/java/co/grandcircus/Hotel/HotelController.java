package co.grandcircus.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	
	@Autowired
	//private MenuItemDao menuItemDao;
	public HotelDao hotelDao;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home");
		TreeSet<String> cities = (TreeSet<String>) hotelDao.findAllCities();
		mv.addObject("cities", cities);
		return mv;
	}
		
	@RequestMapping("/results")
	public ModelAndView showResults(@RequestParam("city")String city) {
		ModelAndView mv = new ModelAndView ("results");
		mv.addObject("city", city);
		mv.addObject("results", hotelDao.findByCity(city));
		System.out.println(hotelDao.findByCity(city));
		return mv;
	}	
	
	@RequestMapping("/cityresults")
	public ModelAndView showCity(@RequestParam("city")String city) {
		ModelAndView mv = new ModelAndView ("results");
		mv.addObject("results", hotelDao.findByCity(city));
		mv.addObject("city", city);
		System.out.println(city);
		return mv;
		
	}
		
		
		
	}
	

