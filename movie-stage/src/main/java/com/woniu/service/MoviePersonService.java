package com.woniu.service;

import com.woniu.entity.MoviePerson;

public interface MoviePersonService {
    MoviePerson selectByMid(Integer mid)throws Exception;
}
