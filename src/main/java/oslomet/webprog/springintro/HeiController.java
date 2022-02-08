package oslomet.webprog.springintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeiController {
@GetMapping("/")
public String hei(String navn) {

    int antallBokstaver = navn.length();


    return "hei verden " + navn + "! Navnet ditt er " + antallBokstaver + " bokstaver langt";
}
}
