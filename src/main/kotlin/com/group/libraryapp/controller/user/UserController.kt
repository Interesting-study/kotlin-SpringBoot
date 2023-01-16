package com.group.libraryapp.controller.user

import com.group.libraryapp.dto.book.request.BookLoanRequest
import com.group.libraryapp.dto.book.request.BookRequest
import com.group.libraryapp.dto.book.request.BookReturnRequest
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import com.group.libraryapp.dto.user.response.UserResponse
import com.group.libraryapp.service.user.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(
    private val userService: UserService,
) {
    @PostMapping("/user")
    fun saveBook(@RequestBody request: UserCreateRequest){
        userService.saveUser(request)
    }

    @GetMapping("/user/")
    fun getUsers(): List<UserResponse> = userService.getUsers()


    @PutMapping("/user")
    fun updateUserName(@RequestBody request: UserUpdateRequest){
        userService.updateUserName(request)
    }

    @DeleteMapping("/user")
    fun deleteUser(@RequestParam name: String){
        userService.deleteUser(name)
    }
}