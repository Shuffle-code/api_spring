package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.open.api_spring.dto.TvDto;
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
	public List<TvDto> findAllTv() {
		return tvService.findAllTv();
	}

}