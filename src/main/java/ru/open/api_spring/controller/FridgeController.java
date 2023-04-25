package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.FridgeDto;
import ru.open.api_spring.dto.PcDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.service.FridgeService;
import ru.open.api_spring.service.PcService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'FRIDGE'")
@RequestMapping("/api/v1/fridge")
public class FridgeController {
	@Autowired
	private FridgeService fridgeService;

	@Operation(summary = "Получение списка всех FRIDGE")
	@GetMapping("/all")
	public List<CommonDto> findAllFridge() {
		try {
			return fridgeService.findAllFridge();
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@Operation(summary = "Получение списка холодильника по наименованию")
	@GetMapping("/{name}")
	public List<CommonDto> findAllName(@PathVariable("name") String name) {
		return fridgeService.findFridgeName(name);
	}

	@Operation(summary = "Получение списка PC по количеству дверей")
	@GetMapping("/category/{categogy}")
	public List<CommonDto> findAllCategory(@PathVariable("categogy") Integer door) {
		return fridgeService.findFridgeByCountDoor(door);
	}

	@Operation(summary = "Добавление модели холодильника]")
	@PostMapping
	public void createModel(@RequestBody FridgeDto fridgeDto) {
		fridgeService.save(fridgeDto);
	}

	@Operation(summary = "Получение списка PC по типу компрессора")
	@GetMapping("/comp/{compressor}")
	public List<CommonDto> findAllProcessor(@PathVariable("compressor") String compressor) {
		return fridgeService.findFridgeCompressor(compressor);
	}

}