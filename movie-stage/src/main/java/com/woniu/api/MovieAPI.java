package com.woniu.api;

import com.woniu.entity.Movie;
import com.woniu.entity.MoviePerson;
import com.woniu.service.MoviePersonService;
import com.woniu.service.MovieService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("movie")
public class MovieAPI {
    @Resource
    private MoviePersonService moviePersonService;
    @Resource
    private MovieService movieService;
    @GetMapping
    @RequestMapping("/bymid/{mid}")
    public Result selectMovieByMid(@PathVariable Integer mid) throws Exception{
        Movie movie = movieService.selectMovieByMid(mid);
        MoviePerson moviePerson = moviePersonService.selectByMid(mid);
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("movie",movie);
        map.put("moviePerson",moviePerson);

        return new Result("success",null,map,null);
    }

    @GetMapping
    @RequestMapping("/bycid/{cid}")
    public Result selectMoviesByCid(@PathVariable Integer cid) throws Exception{
        return new Result("success",null,null,movieService.selectMoviesByCid(cid));
    }

    @GetMapping
    @RequestMapping("/byname/{mName}")
    public Result selectMoviesByName(@PathVariable String mName) throws Exception{
        return new Result("succsee",null,null,movieService.selectMoviesByName(mName));
    }

    @GetMapping
    @RequestMapping("/movieon/{cid}")
    public Result selectMoviesOnByCid(@PathVariable Integer cid) throws Exception{
        Map<String, List<Movie>> MoviesMap = movieService.selectMoviesOnByCid(cid);
        return new Result("success",null,MoviesMap,null);
    }

}
