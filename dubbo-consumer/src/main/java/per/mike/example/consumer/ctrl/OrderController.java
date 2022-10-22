package per.mike.example.consumer.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import per.mike.example.consumer.service.MikeAndChenniService;
import per.mike.example.face.bean.UserAddress;
import per.mike.example.face.service.OrderSerice;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
@Controller
public class OrderController {

    @Autowired
    OrderSerice orderSerice;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderSerice.ininOrder(userId);
    }

    @Autowired
    MikeAndChenniService macSerice;

    @ResponseBody
    @RequestMapping("/doTx1")
    public String doTx1() {
        macSerice.add("MA", "MA1", "CA", "CA1");
        return "doTx1 success~";
    }

    @ResponseBody
    @RequestMapping("/doTx2")
    public String doTx2() {
        macSerice.doTxn();
        return "doTx2 success~";
    }
}
