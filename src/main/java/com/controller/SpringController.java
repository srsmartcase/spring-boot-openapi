package com.controller;

import com.dto.StockDTO;
import com.service.StockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Tag(description = "SmartCase API", name = "Stock Services")
@Controller
public class SpringController {

    private final AtomicInteger counter = new AtomicInteger();

    private final StockService stockService;

    @Autowired
    public SpringController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stocks")
    @Operation(summary = "Get all stocks",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns all stocks",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = StockDTO.class)))
            })
    @ResponseBody
    public List<StockDTO> getAllStocks() {
        return stockService.getAllStocks();
    }




}
