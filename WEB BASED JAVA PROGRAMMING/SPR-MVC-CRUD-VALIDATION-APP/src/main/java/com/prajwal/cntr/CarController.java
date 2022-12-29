package com.prajwal.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prajwal.entity.Car;
import com.prajwal.serv.CarService;
import com.prajwal.serv.CarValidator;

@Controller
public class CarController {

	@Autowired
	private CarService carService;

	@Autowired
	private CarValidator carValidator;

	@RequestMapping(value = { "/car_add_form.htm" })
	public String carAddForm(ModelMap model) {
		model.put("car", new Car());
		return "car_add_form";
	}

	@RequestMapping(value = { "/car_add.htm" }, method = RequestMethod.POST)
	public String carAdd(Car car, BindingResult result, ModelMap model) {

		carValidator.validate(car, result);

		if (result.hasErrors()) {
			return "car_add_form";
		}

		carService.add(car);
		model.put("car", car);
		return "car_add_form";
	}

	@RequestMapping(value = { "/car_list.htm" }, method = RequestMethod.GET)
	public String carList(ModelMap model) {
		List<Car> carList = carService.getAll();
		model.put("cars", carList);
		return "car_list";
	}

	@RequestMapping(value = { "/car_delete.htm" })
	public String carDelete(@RequestParam(name = "id") int id, ModelMap model) {
		carService.remove(id);
		List<Car> carList = carService.getAll();
		model.put("cars", carList);
		return "car_list";
	}

	@RequestMapping(value = { "/car_update_form.htm" })
	public String carUpdateForm(@RequestParam int id, ModelMap model) {
		Car c = carService.get(id);
		model.put("car", c);
		return "car_update_form";
	}

	@RequestMapping(value = { "/car_update.htm" }, method = RequestMethod.POST)
	public String carUpdate(Car car, ModelMap model) {

		carService.modify(car);

		List<Car> carList = carService.getAll();
		model.put("cars", carList);
		return "car_list";
	}

}
