
@RestController
public class Controller {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
    
}