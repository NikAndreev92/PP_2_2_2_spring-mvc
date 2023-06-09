
package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.servise.CarService;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false, defaultValue = "5") Integer count)  {
        List<Car> cars = carService.carsList(count);
        model.addAttribute("cars", cars);
        return "Car";
    }


}