package ico.fes.intro.controllers;

import ico.fes.intro.models.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Principal {
    
    @GetMapping("/empleados")
    public String getEmpleados(Model model){
        Empleado emp = new  Empleado(1, "Jose Madero", 51000, "Limpieza", ("12/05/2000"));
        model.addAttribute("empleado", emp);
        return "empleados";
    }
            
}
