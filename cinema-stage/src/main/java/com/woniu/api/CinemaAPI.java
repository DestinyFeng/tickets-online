package com.woniu.api;

import com.woniu.entity.Cinema;
import com.woniu.service.CinemaService;
import com.woniu.util.Page;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("cinema")
public class CinemaAPI {
    @Resource
    private CinemaService cinemaService;
    @GetMapping
    @RequestMapping("all")
    public Result selectCinemas(Integer pageIndex){
        if(pageIndex==null||pageIndex==0){
            pageIndex = 1;
        }
        Integer num = 5;
        List<Cinema> cinemas = cinemaService.selectAll(pageIndex,num);
        Integer count = cinemaService.count();
        Page page = new Page(pageIndex, count%num==0?count/num:count/num+1, count);
        return new Result("success",null,page,cinemas);
    }
    @GetMapping("bycid")
    public Result selectCinema(Integer cid){
        Cinema cinema = cinemaService.selectById(cid);
        System.out.println(cinema);
        return new Result("success",null,cinema,null);
    }
    //未完成
    @PostMapping
    public Result insertCinema(){
        Cinema cinema = new Cinema();
        cinemaService.insert(cinema);
        return new Result("success",null,null,null);
    }
    @DeleteMapping
    public Result deleteCinema(Integer cid){
        Integer row = cinemaService.delete(cid);
        return new Result("success",null,null,null);
    }
    //未完成
    @PutMapping
    public Result updateCinema(){
        Cinema cinema = new Cinema();
        Integer row = cinemaService.update(cinema);
        return new Result("success",null,null,null);
    }

}
