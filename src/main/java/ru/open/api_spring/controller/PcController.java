package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.PcDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.service.PcService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'PC'")
@RequestMapping("/api/v1/pc")
public class PcController {
	@Autowired
	private PcService pcService;

	@Operation(summary = "Получение списка всех PC")
	@GetMapping("/all")
	public List<CommonDto> findAllTv() {
		return pcService.findAllPc();
	}

	@Operation(summary = "Получение списка PC по наименованию")
	@GetMapping("/{name}")
	public List<CommonDto> findAllName(@PathVariable("name") String name) {
		return pcService.findPcName(name);
	}

	@Operation(summary = "Получение списка PC по категории")
	@GetMapping("/category/{categogy}")
	public List<CommonDto> findAllCategory(@PathVariable("categogy") String categogy) {
		return pcService.findPcCategory(categogy);
	}

	@Operation(summary = "Добавление модели PC")
	@PostMapping
	public void createModel(@RequestBody PcDto pcDto) {
		pcService.save(pcDto);
	}

	@Operation(summary = "Получение списка PC по типу процессора")
	@GetMapping("/proc/{processor}")
	public List<CommonDto> findAllProcessor(@PathVariable("processor") String processor) {
		return pcService.findPcProcessor(processor);
	}

}