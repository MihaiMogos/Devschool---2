package ro.isr.devschool.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mihai MOGOS on 07/12/16.
 */
@RestController
@RequestMapping("/helloworld")
public class HelloWorldRestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>("Hello SpringBoot", HttpStatus.OK);
    }
}
