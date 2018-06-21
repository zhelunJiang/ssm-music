package com.mine.music.controller;

import com.mine.music.entity.TbSinger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("music-manager/singer")
public class SingerController extends BaseController<TbSinger> {

}
