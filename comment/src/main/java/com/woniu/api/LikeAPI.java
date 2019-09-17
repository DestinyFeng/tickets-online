package com.woniu.api;

import com.woniu.entity.Like;
import com.woniu.service.LikeService;
import com.woniu.util.Result;
import com.woniu.util.Sendsms;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("like")
public class LikeAPI {
    @Resource
    private LikeService likeService;

    /**
     * 根据评论id查询评论点赞总数
     * @param cid
     * @return
     * @throws Exception
     */
    @GetMapping("/{cid}")
    public Result getCount(@PathVariable Integer cid)throws Exception{
        return new Result("success",null,likeService.getCount(cid),null);
    }

    /**
     * 新增点赞信息;
     * @param like
     * @return
     * @throws Exception
     */
    @PostMapping
    public Result insertLike(Like like)throws Exception{
        likeService.insertList(like);
        return new Result("success",null,null,null);
    }

    /**
     * 删除点赞信息;
     * @param uid
     * @param cid
     * @return
     * @throws Exception
     */
    @DeleteMapping("/{uid}/{cid}")
    public Result deleteLike(@PathVariable("uid") Integer uid,@PathVariable("cid") Integer cid)throws Exception{
        likeService.deleteLike(uid,cid);
        return new Result("success",null,null,null);
    }
}
