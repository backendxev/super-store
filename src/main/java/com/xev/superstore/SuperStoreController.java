package com.xev.superstore;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SuperStoreController {
    List<Product> inventory = new ArrayList<>();
    
    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id){
        int index = getIndex(id);
        model.addAttribute("product", index == Constants.NOT_VALID ? new Product() : inventory.get(index));
        return "form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model){
        model.addAttribute("inventory", inventory);
        return "inventory";
    }

    @PostMapping("/handleForm")
    public String postMethodName(Product product, RedirectAttributes redirAttrs) {
        int index = getIndex(product.getId().toString());
        if(index == Constants.NOT_VALID){
            inventory.add(product);
            redirAttrs.addFlashAttribute("message", "Product added correctly!");

        }else{
            inventory.set(index, product);
            redirAttrs.addFlashAttribute("message", "Product updated correctly!");
        }
        return "redirect:/inventory";
    }


    public Integer getIndex(String id){ 
        if(id != null){
            for (int i = 0; i < inventory.size(); i++) {
                if(id.compareTo(inventory.get(i).getId().toString()) == 0){
                    return i;
                }
            }
        }
        return Constants.NOT_VALID;
    }
}
