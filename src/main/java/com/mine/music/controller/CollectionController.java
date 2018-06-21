package com.mine.music.controller;

import com.mine.music.entity.TbCollection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("music-manager/collection")
public class CollectionController extends BaseController<TbCollection> {
}
