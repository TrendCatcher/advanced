package mindfulness.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //@Controller + @ResponseBody
@RequiredArgsConstructor
public class OrderControllerV0 {
    private final OrderServiceV0 orderService;

    @GetMapping("/V0/request")      //해당 요청이 오면 메소드가 호출됨
    public String request(String itemId){
        orderService.orderItem(itemId);
        return "ok";
    }
}
