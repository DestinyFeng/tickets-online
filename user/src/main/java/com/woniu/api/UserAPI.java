package com.woniu.api;

import com.woniu.entity.User;
import com.woniu.service.UserService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserAPI {
    @Resource
    private UserService userService;

    /**
     * 查询用户信息
     * @param
     * @return
     * @throws Exception
     */
    @GetMapping
    public Result selectUser()throws Exception{
//        Integer uid = (Integer) session.getAttribute("user");
        return new Result("success",null,userService.getUser(1),null);
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     * @throws Exception
     */
    @PutMapping
    public Result updateUser(User user,String[] type)throws Exception{
        userService.updateUser(user);
        return new Result("success",null,null,null);
    }

    /**
     * 新增用户信息
     * @param user
     * @return
     * @throws Exception
     */
    @PostMapping
    public Result insertUser(User user)throws Exception{
        userService.insertUser(user);
        return new Result("success",null,null,null);
    }

    /**
     * 删除用户信息
     * @return
     * @throws Exception
     */
    @DeleteMapping("/{uid}")
    public Result deleteUser(@PathVariable Integer uid)throws Exception{
        userService.deleteUser(uid);
        return new Result("success",null,null,null);
    }


}
