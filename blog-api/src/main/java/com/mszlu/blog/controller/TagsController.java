package com.mszlu.blog.controller;

import com.mszlu.blog.service.TagsService;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagsService tagsService;

    //tags/hot
    @GetMapping("hot")
    public Result hot(){
        //查询最热的6个标签
        int limit = 6;
        return tagsService.hots(limit);
    }

    @GetMapping
    public  Result findAll(){
        return tagsService.findAll();
    }

    //文章标签内容
    @GetMapping("detail")
    public  Result findAllDetail(){
        return tagsService.findAllDetail();
    }

    //查询标签
    @GetMapping("detail/{id}")
    public  Result findDetailById(@PathVariable("id") Long id){
        return tagsService.findDetailById(id);
    }
}
