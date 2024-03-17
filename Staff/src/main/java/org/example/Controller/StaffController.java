package org.example.Controller;

import org.example.entity.Staff;
import org.example.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;
    @GetMapping("/getAll")
    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }
}
