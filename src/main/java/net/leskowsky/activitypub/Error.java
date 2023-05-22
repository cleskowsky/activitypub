package net.leskowsky.activitypub;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error implements ErrorController {

    /*
     * Capture url, query string, post body for endpoints
     * not implemented yet
     */
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        return "error";
    }
}
