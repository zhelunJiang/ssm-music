package com.mine.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;


@Controller
@RequestMapping("music-manager/file")
public class UploadController {


        @RequestMapping(value="upload",method=RequestMethod.POST)
        @ResponseBody
        public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
            String path = request.getSession().getServletContext().getRealPath("img");
           return  create(file,path);
        }
        @RequestMapping(value = "musicUpload",method=RequestMethod.POST)
        @ResponseBody
        public String  songUpload(MultipartFile file,HttpServletRequest request) throws IOException{
            String path =request.getSession().getServletContext().getRealPath("musicFile");
            return create(file,path);
        }
        @RequestMapping(value = "lrcUpload",method=RequestMethod.POST)
        @ResponseBody
        public String  lrcUpload(MultipartFile file,HttpServletRequest request) throws IOException{
            String path =request.getSession().getServletContext().getRealPath("musicFile");
            return  create(file,path);
        }
        private static String getUniqueFileName() {
            String str = UUID.randomUUID().toString();
            return str.replace("-", "");
        }
        private static String create(MultipartFile file,String path) throws IOException {
            String fileName = file.getOriginalFilename();
            String newFilName = getUniqueFileName()+ fileName.substring(fileName.lastIndexOf("."));
            File dir =new File(path,newFilName);
            if(!dir.exists()){
                System.out.println(dir.mkdirs());
            }
            file.transferTo(dir);
            return newFilName;
        }

}
