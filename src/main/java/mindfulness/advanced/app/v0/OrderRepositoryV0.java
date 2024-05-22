package mindfulness.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository     //DataAccessException
@RequiredArgsConstructor    //component 스캔의 대상
/*컴포넌트 스캔은 스프링 프레임워크에서 빈으로 등록할 클래스를 자동으로 찾아주는 기능*/
public class OrderRepositoryV0 {
    public void save(String itemId){
        //저장 로직
        if(itemId.equals("ex")){    //다양한 예제를 위한 시뮬레이션 코드
            throw new IllegalArgumentException("예외 발생!");
        }
        sleep(1000);    //상품 저장에 1초 걸린다 가정
    }

    private void sleep(int millis) {
        try{
            Thread.sleep(millis);
        }catch( InterruptedException e){
            e.printStackTrace();
        }
    }
}
