package com.zhiying.moviekg.api;

import com.zhiying.moviekg.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserManagementServlet {
    @Autowired
    private UserManagementService userManagementService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addUser(String userName)
    {
        userManagementService.addUser(userName);

    }
}
