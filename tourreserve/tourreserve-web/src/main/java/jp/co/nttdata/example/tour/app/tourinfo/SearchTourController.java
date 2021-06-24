package jp.co.nttdata.example.tour.app.tourinfo;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.joda.time.DateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;

import jp.co.nttdata.example.tour.domain.model.TourInfo;
import jp.co.nttdata.example.tour.domain.repository.tourinfo.TourInfoSearchCriteria;
import jp.co.nttdata.example.tour.domain.service.tourinfo.TourInfoService;

@Controller
@RequestMapping("tours")
public class SearchTourController {

	/**
	 * CustomerService
	 */
	@Inject
	TourInfoService tourInfoService;

	@Inject
	Mapper beanMapper;

	@Inject
	JodaTimeDateFactory dateFactory;



	/**
	 *
	 * @return
	 */
	@ModelAttribute
	public SearchTourForm setupForm() {
		SearchTourForm searchTourForm = new SearchTourForm();
		DateTime dateTime=dateFactory.newDateTime();
		DateTime nextWeekDate=dateTime.plusWeeks(1);
		searchTourForm.setDepartureYear(String.valueOf(nextWeekDate.getYear()));
		searchTourForm.setDepartureMonth(String.valueOf(nextWeekDate.getMonthOfYear()));
		searchTourForm.setDepartureDate(String.valueOf(nextWeekDate.getDayOfMonth()));
		return searchTourForm;
	}

	@RequestMapping(params = "initForm", method = RequestMethod.GET)
	public String searchInitForm() {
		return "redirect:/tours?form";
	}

	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String searchForm(SearchTourForm form) {
		return "searchtour/searchForm";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String search(@Validated SearchTourForm form,BindingResult result, @PageableDefault Pageable pageable,Model model) {
		if (result.hasErrors()) {
			return "searchtour/searchForm";
		}

		TourInfoSearchCriteria tourInfoSearchCriteria=beanMapper.map(form, TourInfoSearchCriteria.class);

		tourInfoSearchCriteria.setDepDay((new DateTime(Integer.parseInt(form.getDepartureYear()), Integer.parseInt(form.getDepartureMonth()),
				Integer.parseInt(form.getDepartureDate()), 0, 0, 0).toDate()));

		Page<TourInfo> page = tourInfoService.searchTour(tourInfoSearchCriteria, pageable);
		page.getContent().size();
		model.addAttribute("page", page);
		model.addAttribute("pageSize",page.getTotalElements());
		return "searchtour/searchForm";
	}

}
