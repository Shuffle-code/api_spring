package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.TvDto;
import ru.open.api_spring.dto.common.CommonDto;
import ru.open.api_spring.service.TvService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'TV'")
@RequestMapping("/api/v1/tv")
public class TvController {
	@Autowired
	private TvService tvService;

	@Operation(summary = "Получение списка всех TV")
	@GetMapping("/all")
	public List<CommonDto> findAllTv() throws NoSuchFieldException, IllegalAccessException {
		return tvService.findAllTv();
	}

	@Operation(summary = "Добавление модели ТВ")
	@PostMapping
	public void createModel(@RequestBody TvDto tvDto) {
		tvService.save(tvDto);
	}

	@Operation(summary = "Получение списка TV по наименованию")
	@GetMapping("/{name}")
	public List<CommonDto> findAllTv(@PathVariable("name") String name) throws NoSuchFieldException, IllegalAccessException {
		return tvService.findTvName(name);
	}

	@Operation(summary = "Получение списка TV по категории")
	@GetMapping("/category/{categogy}")
	public List<CommonDto> findAllCategory(@PathVariable("categogy") String categogy) throws NoSuchFieldException, IllegalAccessException {
		return tvService.findTvCategory(categogy);
	}

	@Operation(summary = "Получение списка TV по технологии")
	@GetMapping("/technology/{technology}")
	public List<CommonDto> findByTechnology(@PathVariable("technology") String technology) throws NoSuchFieldException, IllegalAccessException {
		return tvService.findTvByTechnology(technology);
	}
}