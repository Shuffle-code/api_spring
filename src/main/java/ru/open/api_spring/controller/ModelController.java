package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
	@GetMapping("/model")
//	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Model> findAll() {
		return modelService.findAll();
	}

	@GetMapping("/{Id}")
	public Model getModel(@PathVariable("Id") Long id) {
		return modelService.findById(id);
	}

	@Operation(summary = "Создание модели")
	@PostMapping
	public void createModel(@RequestBody Model model) {
		modelService.save(model);
	}


}