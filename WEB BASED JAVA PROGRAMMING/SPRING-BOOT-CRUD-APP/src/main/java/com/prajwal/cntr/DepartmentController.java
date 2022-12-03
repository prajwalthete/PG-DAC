package com.prajwal.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prajwal.entity.Department;
import com.prajwal.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping(value = { "/dept" })
	public String departmentAdd(@RequestBody Department department) {
		departmentService.add(department);
		return "success";
	}

	@PutMapping(value = { "/dept" })
	public String departmentUpdate(@RequestBody Department department) {
		departmentService.modify(department);
		return "success";
	}

	@DeleteMapping(value = { "/dept/{no}" })
	public String departmentDelete(@PathVariable int no) {
		departmentService.remove(no);
		return "success";
	}

	@GetMapping(value = { "/dept/{no}" })
	public Department departmentSelect(@PathVariable int no) {
		return departmentService.get(no);
	}

	@GetMapping(value = { "/dept" })
	public List<Department> departmentSelectAll() {
		return departmentService.getAll();
	}

}
