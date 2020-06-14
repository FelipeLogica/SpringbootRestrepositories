package Voigt.Felipe.ExercicioHeloWordRestrepositories.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 23:29
 * @category controler
 */
@RestController
public class HeloWordControler {

    @GetMapping
    public String index() {
        return "Ola mundo! ";
    }
}
