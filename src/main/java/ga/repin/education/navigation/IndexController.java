package ga.repin.education.navigation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static ga.repin.education.navigation.NavigationConstants.*;

@RestController
public class IndexController {
    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping(path = ROOT_URL_01)
    public String showIndexPage() {
        return indexService.course1Index();
    }
    
    @GetMapping(path = ROOT_URL_02)
    public String showCourse2Page() {
        return indexService.course2Index();
    }
    
    @GetMapping(path = ROOT_URL_03)
    public String showCourse3Page() {
        return indexService.course3Index();
    }
    
    @GetMapping(path = "/exit")
    public String stopServer(@RequestParam(value = "pass", required = false) String pass) {
        return indexService.stopSpring(pass);
    }
    
    @GetMapping(path = "/switchtheme")
    public String switchTheme() {
        return indexService.letSwitchTheme();
    }
    
    @GetMapping(path = ga.repin.education.course03.topic02.hw.HwConstants.HW_ENDPOINT + "/openapi.json", produces = "application/json;UTF-8")
    @ResponseBody
    public String schoolOpenApi() {
        return null; //indexService.schoolOpenApiSvc();
    }
}
