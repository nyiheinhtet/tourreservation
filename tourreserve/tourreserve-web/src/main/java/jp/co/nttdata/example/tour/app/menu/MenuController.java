package jp.co.nttdata.example.tour.app.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author nh.htet
 *
 */
@Controller
public class MenuController {


	@RequestMapping(value="/",method=RequestMethod.GET)
	public String init() {

		return "menu/menu";
	}
}
