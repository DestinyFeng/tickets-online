package com.woniu.service.impl;

import com.woniu.entity.Movie;
import com.woniu.mapper.MovieMapper;
import com.woniu.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieMapper movieMapper;
    @Override
    public Movie selectMovieByMid(Integer mid) throws Exception {
        Movie movie = movieMapper.selectMovieByMid(mid);
        return movie;
    }

    @Override
    public List<Movie> selectMoviesByName(String mName) throws Exception {
        List<Movie> movies = movieMapper.selectMoviesByName("%" + mName + "%");
        return movies;
    }

    @Override
    public List<Movie> selectMoviesByCid(Integer cid) throws Exception {
        List<Movie> movies = movieMapper.selectMoviesByCid(cid);
        return movies;
    }

    @Override
    public List<Movie> selectMoviesBytid(Integer tid, String comntry, Date uptime, Integer pageIndex, Integer num) throws Exception {
        return null;
    }

    @Override
    public Map<String, List<Movie>> selectMoviesOnByCid(Integer cid) throws Exception {
        //查询出当前影院所有已经拍片的所有电影
        List<Movie> movies = movieMapper.selectMOviesOnByCid(cid);

        //获取当前时间
        Date today = new Date();

        //储存正在上映的电影
        List<Movie> onShow = new ArrayList<>();
        //储存马上上映的电影
        List<Movie> willShow = new ArrayList<>();

        //将查询出的所有电影分类
        for(Movie m : movies){
            if(m.getUptime().before(today)){
                //上映日期在今天之前说明正在热映
                onShow.add(m);
            }else{
                //即将上映
                willShow.add(m);
            }
        }
        HashMap<String, List<Movie>> map = new HashMap<>();
        map.put("onShow",onShow);
        map.put("willShow",willShow);

        return map;
    }

    @Override
    public List<Movie> selectMovieListOrderByScore(Integer num) throws Exception {
        return movieMapper.selectMovieListByScore(num);
    }

    @Override
    public List<Movie> selectMovieListOrderByTime(Integer num) throws Exception {
        return movieMapper.selectMovieListByTime(num);
    }

}
