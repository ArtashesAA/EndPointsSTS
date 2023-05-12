package ejercicioEndpoints.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicioEndpoints.model.Detail;


@RestController
@RequestMapping("/detail")
public class DetailController {

	@GetMapping("/getDetailById")
    public ResponseEntity<Detail> getDetailById(@PathVariable String budget) {
        Detail Detail = new Detail();
        Detail.setBudget(budget);
        return ResponseEntity.ok(Detail);
    }
    
    @PostMapping("/createDetail")
    public ResponseEntity<Detail> createDetail(@RequestBody Detail Detail) {
        return ResponseEntity.ok(Detail);
    }
    
    @PutMapping("/updateDetail")
    public ResponseEntity<Detail> updateDetail(@PathVariable String budget, @RequestBody Detail Detail) {
    	Detail.setBudget(budget);
        return ResponseEntity.ok(Detail);
    }
    
    @DeleteMapping("/deleteDetail")
    public ResponseEntity<Void> deleteDetail(@RequestBody Detail Detail) {
        Detail.setProject(null);
        Detail.setBudget(null);
        Detail.setContent(null);
        Detail.setDate(null);
        Detail.setType(null);
        return ResponseEntity.noContent().build();
    }
}
