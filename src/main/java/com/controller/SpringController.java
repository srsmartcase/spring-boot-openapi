package com.controller;

import com.dto.StockDTO;
import com.model.User;
import com.repository.UserRepository;
import com.service.StockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Tag(description = "SmartCase API", name = "Stock Services")
@Controller
public class SpringController {

    private final AtomicInteger counter = new AtomicInteger();

    private final UserRepository userRepository;
    private final StockService stockService;

    @Autowired
    public SpringController(UserRepository userRepository, StockService stockService) {
        this.userRepository = userRepository;
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

    @GetMapping("/users")
    @Operation(summary = "Returns all users",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns all users",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = User.class)))
            })
    @ResponseBody
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Deprecated
    @PostMapping("/users")
    @Operation(summary = "Register a new user",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns the registered user",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = User.class)))
            })
    @ResponseBody
    public User register(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        User newUser = new User(counter.incrementAndGet(), name);
        return userRepository.addUser(newUser);
    }

    @Deprecated
    @PutMapping("/users/{id}")
    @Operation(summary = "Update a user's name",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns the updated user",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = User.class)))
            })
    @ResponseBody
    public User updateUser(@PathVariable(value = "id") int id, String newName) {
        return userRepository.updateUser(id, newName).orElseThrow(() -> new EntityNotFoundException("Error! User not found!"));
    }

    @Deprecated
    @DeleteMapping("/users/{id}")
    @Operation(summary = "Delete a user",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Returns a boolean",
                            content = @Content(mediaType = "application/json"))
            })
    @ResponseBody
    public Boolean deleteUser(@PathVariable(value = "id") int id) {
        return userRepository.deleteUser(id);
    }
}
