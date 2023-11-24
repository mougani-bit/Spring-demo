package fr.diginamic.demospring;


import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.Arrays;
        import java.util.List;

@RestController
@RequestMapping("/villes")
public class VilleControleur {

    @GetMapping
    public List<String> getListeVilles() {
        return Arrays.asList("Paris", "Londres", "New York", "Tokyo");
    }
}
