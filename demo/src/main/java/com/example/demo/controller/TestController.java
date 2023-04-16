package com.example.demo.controller;

import com.example.demo.moedl.User;
import com.example.demo.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.hibernate.result.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Tag(name = "測試")
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @Operation(summary = "測試取得資料庫的 User Table", responses = {
            @ApiResponse(responseCode = "200", content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
            @ApiResponse(responseCode = "503", content = @Content(schema = @Schema(implementation = Output.class))) }, security = @SecurityRequirement(name = "Authorization"))
    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return service.getUserList();
    }

}
