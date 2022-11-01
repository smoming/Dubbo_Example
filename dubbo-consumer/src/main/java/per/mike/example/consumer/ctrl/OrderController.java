package per.mike.example.consumer.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import per.mike.example.consumer.service.OrderTxnService;
import per.mike.example.face.bean.UserAddress;
import per.mike.example.face.service.OrderSerice;

/**
 * @author DXC Mike
 * @date 2022年10月16日
 * @remark
 */
@RequestMapping("/product")
@RestController
public class OrderController {

    @Autowired
    OrderSerice orderSerice;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderSerice.ininOrder(userId);
    }

    @Autowired
    OrderTxnService macSerice;

    @ResponseBody
    @RequestMapping("/doAddTxn")
    public String doAddTxn() {
        macSerice.doAddTxn();
        return "doAddTxn success~";
    }

    @ResponseBody
    @RequestMapping("/doTxn")
    public String doTxn() {
        macSerice.doTxn();
        return "doTxn success~";
    }
}
