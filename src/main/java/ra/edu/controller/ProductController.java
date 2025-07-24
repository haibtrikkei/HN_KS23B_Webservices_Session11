package ra.edu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ra.edu.model.dto.response.APIResponse;
import ra.edu.model.entity.Product;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @GetMapping
    public ResponseEntity<APIResponse<List<Product>>> getProducts(){
        //....
        return null;
    }

    @PostMapping
    public ResponseEntity<APIResponse<Product>> postProduct(@RequestBody Product product){
        //....
        return null;
    }
}
