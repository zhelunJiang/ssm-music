package com.mine.music.controller;

import com.mine.music.entity.TbComment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("music-manager/comment")
public class CommentController extends BaseController<TbComment> {
}
