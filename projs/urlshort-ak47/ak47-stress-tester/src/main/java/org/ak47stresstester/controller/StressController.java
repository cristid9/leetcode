package org.ak47stresstester.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.ak47stresstester.service.StressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/url")
@AllArgsConstructor
public class StressController {

    private StressService stressService;

    @GetMapping(path = "/stress/{numThreads}")
    public ResponseEntity<Void> stressTest(
            @PathVariable @NonNull Integer numThreads,
            @RequestParam @NonNull Integer numRequests)
    {

        stressService.stressTest("http://149.202.9.27:8080/api/url/short?url=http://www.livejasmin.com",
                numThreads, numRequests);


        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
