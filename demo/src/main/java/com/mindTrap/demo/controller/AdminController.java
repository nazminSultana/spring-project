package com.mindTrap.demo.controller;

import com.mindTrap.demo.entity.Admin;
import com.mindTrap.demo.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/admin/add")
    public void addAdmin(
            @RequestBody Admin admin
    ){
        adminService.addAdmin(admin);
    }

    @GetMapping("/admin/get")
    public List<Admin> gwtAdmin(){
       return adminService.getAdmin();
    }
    @PutMapping("/admin/update/{id}")
            public void updateAdmin(
                    @PathVariable int id,
                    @RequestBody Admin admin
    ){
        adminService.updateAdmin(id,admin);
    }

    @DeleteMapping("/admin/delete/{id}")
    public void deleteAdmin(
            @PathVariable int id
    ){
        adminService.deleteAdmin(id);
    }
}
