import java.util.ArrayList;
import java.util.List;

public class ManageMotoBike {
    List<MotoBike> motoBikeList = new ArrayList<>();
    ManageMotoBike(){

    }
    public void addMotoBike(MotoBike motoBike){
        motoBikeList.add(motoBike);
    }

    public void showMotoBike(){
        for (MotoBike motoBike : motoBikeList) {
            System.out.println(motoBike);
        }
    }

    public void update(int id, MotoBike motoBike){
        int index=-1;
        for (int i = 0; i < motoBikeList.size(); i++) {
            if (id == this.motoBikeList.get(i).getId()){
                index = i;
            }
        }
        this.motoBikeList.set(index , motoBike);
    }
    
    public void deleteMotoBike(int id){
        int index = -1;
        for (int i = 0; i < this.motoBikeList.size(); i++) {
            if (id == this.motoBikeList.get(i).getId()) {
                index = i;
            }
        }
        this.motoBikeList.remove(index);
    }


}
