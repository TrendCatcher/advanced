package mindfulness.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service        // Service도 컴포넌트이므로 자동으로 @RequiredArgsConstructor에 의해 spring Bean에 등록됨
@RequiredArgsConstructor
public class OrderServiceV0 {

    private final OrderRepositoryV0 orderRepository;

    public void orderItem(String itemId){       //실무에서는 복잡한 비즈니스 로직, 본예제에서는 단순하게 저장하는 로직만
        orderRepository.save(itemId);
    }
}
