package mindfulness.advanced.trace;

import java.util.UUID;

public class TraceId {
    private String id;      //트랜잭션id
    private int level;      //메서드 호출 깊이-> level

    public TraceId () {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level) {
        this.id = id;
        this.level = level;
    }


    private String createId() {
        return UUID.randomUUID().toString().substring(0,8); //
    }

    private TraceId createNextId(String id, int level){
        return new TraceId(id, level+1);
    }
    private TraceId previousNextId(String id, int level){
        return new TraceId(id, level-1);
    }

    public boolean isFirstLevel(){
        return level ==0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
