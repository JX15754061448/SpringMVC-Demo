package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Desc: 处理器
 * @Author: 知否技术
 * @date: 下午7:39 2022/4/29
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "你好啊，李银河，我是王小波。");
        mv.setViewName("/hello");
        return mv;
    }
}
