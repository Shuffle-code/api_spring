package ru.open.api_spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.open.api_spring.dto.PcDto;
import ru.open.api_spring.dto.TvDto;
import ru.open.api_spring.service.PcService;
import ru.open.api_spring.service.TvService;

import java.util.List;

@RestController
@Tag(name = "Контроллер, обеспечивающий работу с 'PC'")
@RequestMapping("/api/v1/pc")
public class PcController {
	@Autowired
	private PcService pcService;

	@Operation(summary = "Получение списка всех PC")
	@GetMapping("/all")
	public List<PcDto> findAllTv() {
		return pcService.findAllPc();
	}

}