package com.mindTrap.demo.service;

import com.mindTrap.demo.entity.Admin;
import com.mindTrap.demo.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void addAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    public void updateAdmin(int id, Admin admin) {
        Admin a = adminRepository.findById(id).get();
        a.setName(admin.getName());
        a.setEmail(admin.getName());
        a.setPassword(admin.getPassword());

        adminRepository.save(a);
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}
