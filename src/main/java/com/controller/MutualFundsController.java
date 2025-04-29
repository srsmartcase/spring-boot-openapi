package com.controller;

import com.dto.MutualFundsDTO;
import com.dto.StockDTO;
import com.service.MutualFundsService;
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

@Tag(description = "Mutual Funds API", name = "Stock Services")
@Controller
public class MutualFundsController {

    private final AtomicInteger counter = new AtomicInteger();

    private final MutualFundsService mutualFundsService;
    @Autowired
    public MutualFundsController(MutualFundsService mutualFundsService) {
        this.mutualFundsService = mutualFundsService;
    }



    @GetMapping("/mutualFunds/getAllMutualFunds")
    @Operation(summary = "Get all Mutual Funds",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns all Mutual Funds",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = MutualFundsDTO.class)))
            })
    public List<MutualFundsDTO> getAllMutualFunds() {
        return mutualFundsService.getAllMutualFunds();
    }






}
