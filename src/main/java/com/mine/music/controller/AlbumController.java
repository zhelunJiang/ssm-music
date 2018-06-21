package com.mine.music.controller;

import com.mine.music.entity.TbAlbum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("music-manager/album")
public class AlbumController extends BaseController<TbAlbum> {
}
