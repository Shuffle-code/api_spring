package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.common.TechnicDto;
import ru.open.api_spring.entity.Technic;
import ru.open.api_spring.service.TechnicService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'type technic'")
@RequestMapping("/api/v1/technic")
public class TechnicController {
	@Autowired
	private TechnicService technicService;

	@Operation(summary = "Получение списка всей техники")
	@GetMapping("/all")
//	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Technic> findAll() {
		return technicService.findAll();
	}
	@Operation(summary = "Получение модельного ряда по ID")
	@GetMapping("/{Id}")
	public Technic getTechnic(@PathVariable("Id") Long id) {
		return technicService.findById(id);
	}

	@Operation(summary = "Создание модельного ряда")
	@PostMapping
	public void createTechnic(@RequestBody TechnicDto technicDto) {
		technicService.save(technicDto);
	}

}