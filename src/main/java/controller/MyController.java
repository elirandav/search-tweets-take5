package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(value="/getTweets/{name}", method = RequestMethod.GET)
    public @ResponseBody
    String hell(@PathVariable("name") String name) {
        //SearchTweets searchTweers = new SearchTweets();
        //List<String> top5 = searchTweers.getTop5(name);
        //return String.join("\n", top5);
        return  "Boo000000";
    }
}
