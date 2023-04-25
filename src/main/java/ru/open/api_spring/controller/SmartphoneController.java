package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.SmartphoneDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.service.SmartphoneService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу со смартфонами")
@RequestMapping("/api/v1/smartphone")
public class SmartphoneController {
	@Autowired
	private SmartphoneService smartphoneService;

	@Operation(summary = "Получение списка всех смартфонов")
	@GetMapping("/all")
	public List<CommonDto> findAllFridge() {
		return smartphoneService.findAllSmartphone();
	}

	@Operation(summary = "Получение списка смартфоновпо наименованию")
	@GetMapping("/{name}")
	public List<CommonDto> findAllName(@PathVariable("name") String name) {
		return smartphoneService.findSmartphoneName(name);
	}

	@Operation(summary = "Получение списка смартфонов по количеству камер")
	@GetMapping("/cameras/{cam}")
	public List<CommonDto> findSmartByCameras(@PathVariable("cam") Integer cam) {
		return smartphoneService.findSmartphoneByCountCameras(cam);
	}

	@Operation(summary = "Добавление модели смартфона]")
	@PostMapping
	public void createModel(@RequestBody SmartphoneDto smartphoneDto) {
		smartphoneService.save(smartphoneDto);
	}

	@Operation(summary = "Получение списка смартфонов по памяти")
	@GetMapping("/remember/{remember}")
	public List<CommonDto> findAllProcessor(@PathVariable("remember") String remember) {
		return smartphoneService.findSmartphoneRemember(remember);
	}

}