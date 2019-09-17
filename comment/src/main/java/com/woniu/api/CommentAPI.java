package com.woniu.api;

import com.woniu.entity.Comment;
import com.woniu.service.CommentService;
import com.woniu.util.Page;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("comment")
public class CommentAPI {
    @Resource
    private CommentService commentService;
    /**
     * 分页查询评论信息；
     * @return
     * @throws Exception
     */
    @GetMapping
    public Result getComments(Integer pageIndex)throws Exception{
        /*不传参默认为第一页*/
        if(null==pageIndex||"".equals(pageIndex)){
            pageIndex=1;
        }
        int num=5;
        /*查询count*/
        int dataCount = commentService.getCount();
        /*计算总页数*/
        int pageCount=dataCount%num==0?dataCount/num:dataCount/num+1;
        /*查询评论集合*/
        List<Comment> comments = commentService.getComments(pageIndex, num);
        /*封装page对象*/
        Page page=new Page(pageIndex,pageCount,dataCount);
        System.out.println("page________________:"+page);
        System.out.println("comments____________:"+comments);
        return new Result("success",null,page,comments);
    }

    /**
     * 新增评论信息
     * @param comment
     * @return
     * @throws Exception
     */
    @PostMapping
    public Result insertComment(Comment comment)throws Exception{
        commentService.insertComment(comment);
        return new Result("success",null,null,null);
    }

}
