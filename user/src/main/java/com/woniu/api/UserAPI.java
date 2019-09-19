package com.woniu.api;

import com.woniu.entity.Type;
import com.woniu.entity.User;
import com.woniu.entity.UserType;
import com.woniu.service.TypeService;
import com.woniu.service.UserService;
import com.woniu.util.Result;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserAPI {
    @Resource
    private UserService userService;
    @Resource
    private TypeService typeService;
    private static String filename=null;

    /**
     * 查询用户信息，同时判断用户是否已经登陆；
     * @param
     * @return
     * @throws Exception
     */
    @GetMapping
    public Result selectUser(HttpSession session)throws Exception{
        String code="success";
        String message="";
        /*获取user对象*/
        User user =  (User)session.getAttribute("user");
        /*判断是否为空，为空则未登录*/
        if(user==null){
            code="error";
            message="请先登陆";
            return new Result(code,message,null,null);
        }else return new Result(code,message,userService.getUser(user.getId()),null);
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     * @throws Exception
     */
    @PutMapping
    public Result updateUser(User user,int[] type)throws Exception{
        if(type!=null){
            /*修改user信息*/
            userService.updateUser(user);
            /*删除用户电影类型信息*/
            typeService.deleteUserType(user.getId());
            /*新增userType信息*/
            for(int i=0;i<type.length;i++){
                UserType userType=new UserType();
                userType.setUid(user.getId());
                userType.setTid(type[i]);
                typeService.insertUserType(userType);
            }
        }
        return new Result("success",null,null,null);
    }

    /**
     * 新增用户信息
     * @param user
     * @return
     * @throws Exception
     */
    @PostMapping
    public Result insertUser(User user)throws Exception{
        userService.insertUser(user);
        return new Result("success",null,null,null);
    }

    /**
     * 删除用户信息
     * @return
     * @throws Exception
     */
    @DeleteMapping("/{uid}")
    public Result deleteUser(@PathVariable Integer uid)throws Exception{
        userService.deleteUser(uid);
        return new Result("success",null,null,null);
    }

    /**
     * 上传图片
     * @param file
     * @param request
     * @return
     * @throws IOException
     */

    @PostMapping("upload")
    public Result upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        String message="ok";
        /*获取session并取出user用户*/
        HttpSession session = request.getSession();
        User user1 = (User) session.getAttribute("user");
        /*判断文件是否为空*/
        if(!file.isEmpty()){
            long l = System.currentTimeMillis();
            filename = String.valueOf(l)+file.getOriginalFilename();
            String suffix = filename.substring(filename.lastIndexOf(".")+1);
            /*获取当前路径；*/
            /*String filepath = TouristDynamicController.class.getResource("/").getPath()+"static/upload";*/
            String filepath=null;
            /*判断是否符合格式*/
            if(suffix.equals("mp4")){
                filepath = System.getProperty("user.dir")+"\\"+"src\\main\\resources\\static\\upload";
            }else if (suffix.equals("jpg")||suffix.equals("png")||suffix.equals("gif")){
                filepath=request.getServletContext().getRealPath("/upload/images");
            }
            /*设置文件存储目录，没有就先生成*/
            String url=filepath+"\\"+filename;
            if(suffix.equals("jpg")||suffix.equals("gif")||suffix.equals("png")||suffix.equals("mp4")){
                File upload=new File(filepath);
                if(!upload.exists()){
                    upload.mkdirs();
                }
                File url1=new File(url);
                try{
                    file.transferTo(url1);
                    /*查询用户图片信息*/
                    User user = userService.getUser(user1.getId());
                    String phone = user.getUpic().substring(user.getUpic().lastIndexOf("=") + 1);
                    /*删除该用户之前的图片*/
                    File file1 = new File(phone);
                    if(file1.exists()){
                        file1.delete();
                    }
                    /*替换数据库upic信息*/
                    user.setUpic("/api-user/user/io?img="+url.replace("\\","/"));
                    userService.updateUser(user);
                }catch (Exception e){
                    e.printStackTrace();
                    message="服务器异常";
                }
            }else{
                message="请选择图片";
            }
        }
        return new Result("success",message,null,null);
    }
    //将图片使用io流写出到页面上；
    @GetMapping("io")
    public void selectPicture(String img, HttpServletResponse response)throws Exception{
        FileInputStream fi=new FileInputStream(new File(img));
        OutputStream os = response.getOutputStream();
        byte[] by=new byte[1024];
        int len=0;
        while((len=fi.read(by))>0){
            os.write(by,0,len);
        }
        fi.close();
        os.close();
    }

}
