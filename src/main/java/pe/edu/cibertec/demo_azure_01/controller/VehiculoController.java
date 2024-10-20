package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {

    @GetMapping("/")
    public String getVehicules(Model model){
        List<VehiculoModel> list = new ArrayList<VehiculoModel>();
        list.add(new VehiculoModel(1,"toyota","Corolla","Rojo","ABC123"));
        list.add(new VehiculoModel(2, "Honda", "Civic", "Azul", "XYZ456"));
        list.add(new VehiculoModel(3, "Ford", "Focus", "Negro", "LMN789"));
        list.add(new VehiculoModel(4, "Chevrolet", "Cruze", "Blanco", "DEF321"));
        list.add(new VehiculoModel(5, "Nissan", "Sentra", "Gris", "GHI654"));
        list.add(new VehiculoModel(6, "Mazda", "3", "Plata", "JKL987"));
        model.addAttribute("vehicleList",list);
        return "index";
    }
}
