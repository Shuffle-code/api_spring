package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.ModelDto;
import ru.open.api_spring.entity.Model;
import ru.open.api_spring.service.ModelService;
import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'model'")
@RequestMapping("/api/v1/")
public class ModelController {
	@Autowired
	private ModelService modelService;

	@Operation(summary = "Получение списка всех моделей")
	@GetMapping("/all/model")
//	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Model> findAll() {
		return modelService.findAll();
	}
	@Operation(summary = "Получение модели по ID")
	@GetMapping("/{Id}")
	public Model getModel(@PathVariable("Id") Long id) {
		return modelService.findById(id);
	}

	@Operation(summary = "Создание модели")
	@PostMapping
	public void createModel(@RequestBody ModelDto modelDto) {
		modelService.save(modelDto);
	}
	@Operation(summary = "Получение списка всех моделей по ID модельного ряда")
	@GetMapping("/all/{Id}")
//	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Model> findAllTv(@PathVariable("Id") int id) {
		return modelService.findByTechnicId(id);
	}

}