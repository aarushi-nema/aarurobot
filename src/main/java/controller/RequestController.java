package controller;

import framework.Request;
import framework.RequestManager;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ajay on 13/6/21.
 */
@Controller
@RequestMapping("/request")
public class RequestController {
        @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},
                    produces = {MediaType.APPLICATION_JSON_VALUE})
        @ResponseBody
        public Request processRequest(@RequestBody Request request) {
            request = RequestManager.getInstance().process(request);
            return request;
        }

}
